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

import br.inf.cs.data.daoImpl.ProdutoDaoImpl;
import br.inf.cs.data.daoImpl.ProdutoPmcDaoImpl;
import br.inf.cs.model.Produto;
import br.inf.cs.model.ProdutoPmc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class ProductService {

    ProdutoDaoImpl produtoDao = new ProdutoDaoImpl();
    ProdutoPmcDaoImpl produtoPmcDao = new ProdutoPmcDaoImpl();

    public void saveJsonOnDatabase(JSONArray jsonArray, String aliquota){

        long ean;
        double pmc;
        double pf;
        String ncm;

        ProdutoPmc produtoPmc;

        for (Object object : jsonArray) {
            switch (aliquota){
                case "17":
                    ean = ((JSONObject) object).getLong("EAN");
                    pmc = ((JSONObject) object).getDouble("PMC_"+aliquota);
                    pf = ((JSONObject) object).getDouble("PF_"+aliquota);
                    try{
                    ncm = ((JSONObject) object).getString("NCM");}
                    catch (JSONException e){
                        ncm = null;
                    }

                    List<Produto> produtoList = produtoDao.findByCodigoBarra(ean);
                    if(produtoList != null ){
                        for (Produto produto : produtoList) {

                            // Update or Create PMC
                            produtoPmc = new ProdutoPmc();
                            produtoPmc.setProd_cod(produto.getCodigo());
                            produtoPmc.setAliquota(Double.valueOf(aliquota));
                            produtoPmc.setPreco_maximo_consumidor(pmc);

                            if (pmc > 0) {
                                System.out.println("PMC: " + produtoPmc.getPreco_maximo_consumidor() + " -> " + pmc );
                                if(produtoPmcDao.has(produtoPmc)){
                                    produtoPmcDao.update(produtoPmc);
                                }else{
                                    produtoPmcDao.create(produtoPmc);
                                }
                            }

                            // Update PF
                            System.out.println("PF: " + produto.getPreco_fabricante() + " -> " + pf );
                            System.out.println("NCM: " + produto.getCodigo_ncm() + " -> " + ncm );

                            //Se PF
                            produto.setPreco_fabricante(pf);
                            if(produto.getAliquota_abc_farma().equals(Double.valueOf(aliquota))){
                                produtoDao.update(produto);
                            }

                            //Se NCM
                            produto.setCodigo_ncm(ncm);
                            produtoDao.update(produto);

                        }
                    }
                    break;
                default:
                    throw new RuntimeException("Aliquota " + aliquota + " não existe na ABCFARMA");
            }
        }
    }
}
