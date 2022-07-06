/*
 * Copyright 2021 Cleuson Santos <cleusonss@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.inf.cs.service;

import br.inf.cs.data.daoImpl.PrincipioAtivoDaoImpl;
import br.inf.cs.model.PrincipioAtivo;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrincipioAtivoService {

    public void saveJsonOnDatabase(JSONArray jsonArray, boolean bool){

        if(bool){
            for (Object object : jsonArray) {
                PrincipioAtivo principioAtivo = new PrincipioAtivo();
                PrincipioAtivoDaoImpl principioAtivoDao = new PrincipioAtivoDaoImpl();
                String composicao = ((JSONObject) object).getString("COMPOSICAO");
                System.out.println(composicao);
                List<PrincipioAtivo> listPrincipioAtivo = principioAtivoDao.findByNome(composicao);
                if(listPrincipioAtivo == null){
                    System.out.println("NH:  "+ composicao);
                }
            }
        }
    }

    public void saveSetOnDatabase(Set<PrincipioAtivo> set){

        PrincipioAtivoDaoImpl principioAtivoDao = new PrincipioAtivoDaoImpl();
            for (PrincipioAtivo principioAtivo : set) {
                List<PrincipioAtivo> listPrincipioAtivo = principioAtivoDao.findByNome(principioAtivo.getNome());
                if(listPrincipioAtivo == null || listPrincipioAtivo.size() == 0){
                    principioAtivoDao.create(principioAtivo);
                }else{
                    for(PrincipioAtivo principioAtivo1 : listPrincipioAtivo){
                        principioAtivo1.setDcb(principioAtivo.getDcb());
                        principioAtivoDao.update(principioAtivo1);
                    }
                }
            }
    }

    public Set<PrincipioAtivo> JSONArrayToSet(JSONArray jsonArray){
        Set<PrincipioAtivo> set = new HashSet<>();
        PrincipioAtivo principioAtivo;
        for (Object object : jsonArray) {
            principioAtivo = new PrincipioAtivo();
            principioAtivo.setNome(((JSONObject) object).getString("COMPOSICAO").trim());
            principioAtivo.setDcb(((JSONObject) object).getString("DCB").trim());
            if(!set.contains(principioAtivo)){
                set.add(principioAtivo);
            }
        }
        return set;
    }
}
