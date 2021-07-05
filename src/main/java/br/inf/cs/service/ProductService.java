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

import br.inf.cs.dao.ProductDao;
import br.inf.cs.data.DataSource;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.Produto;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductService {

    ProductDao productDao = new ProductDao();
    Produto produto;

    public void setPMC17(JSONArray jsonArray) {
        if (Boolean.TRUE.equals(DataSource.connect())) {
            produto = new Produto();
            for (Object object : jsonArray) {
                String pmc17 = ((JSONObject) object).getString("PMC_17");
                String ean = ((JSONObject) object).getString("EAN");

                if (!pmc17.equals("0.00")) {
                    produto.setEAN(ean);
                    produto.setPMC_17(pmc17);
                    Integer i = productDao.setPMC17(produto);
                    if (i > 0) {
                        Logger.info(this.getClass(), "[" + i + "] EAN: " + produto.getEAN() + " PMC17: " + produto.getPMC_17());
                    }
                }
                produto = new Produto();
            }
        }
        DataSource.close();
    }

    public void getCheckRows(JSONArray jsonArray) {
        if (Boolean.TRUE.equals(DataSource.connect())) {
            produto = new Produto();
            String ean;
            Integer rows;
            for (Object object : jsonArray) {
                ean = ((JSONObject) object).getString("EAN");
                produto.setEAN(ean);
                rows = productDao.getRows(produto);

                if (rows > 1) {
                    Logger.info(this.getClass(), "[" + rows + "] EAN: " + ean);
                }
            }
        }
        DataSource.close();

    }

    public void setPF17(JSONArray jsonArray) {
        if (Boolean.TRUE.equals(DataSource.connect())) {
            produto = new Produto();
            for (Object object : jsonArray) {
                String pf17 = ((JSONObject) object).getString("PF_17");
                String ean = ((JSONObject) object).getString("EAN");

                if (!pf17.equals("0.00")) {
                    produto.setEAN(ean);
                    produto.setPF_17(pf17);
                    Integer i = productDao.setPF17(produto);
                    if (i > 0) {
                        Logger.info(this.getClass(), "[" + i + "] EAN: " + produto.getEAN() + " PF17: " + produto.getPF_17());
                    }
                }
                produto = new Produto();
            }
        }
        DataSource.close();
    }
}
