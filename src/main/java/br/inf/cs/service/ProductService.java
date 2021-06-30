package br.inf.cs.service;

import br.inf.cs.dao.ProductDao;
import br.inf.cs.data.ConnectionU;
import br.inf.cs.model.Produto;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductService {

    ProductDao productDao = new ProductDao();
    Produto produto;

    public void setPMC17(JSONArray jsonArray){
        if (Boolean.TRUE.equals(ConnectionU.connect())) {
            produto = new Produto();
            for (Object object : jsonArray) {
                String pmc17 = ((JSONObject) object).getString("PMC_17");
                String ean = ((JSONObject) object).getString("EAN");

                if (!pmc17.equals("0.00")) {
                    produto.setEAN(ean);
                    produto.setPMC_17(pmc17);
                    Integer i = productDao.setPMC17(produto);
                    if (i > 0) {
                        System.out.println("[" + i + "] EAN: " + produto.getEAN() + " PMC17: " + produto.getPMC_17());
                    }
                }
                produto = new Produto();
            }
        }
        ConnectionU.close();
    }

    public void getCheckRows(JSONArray jsonArray){
        if (Boolean.TRUE.equals(ConnectionU.connect())) {
            produto = new Produto();
            String ean;
            Integer rows;
            for (Object object : jsonArray) {
                ean = ((JSONObject) object).getString("EAN");
                produto.setEAN(ean);
                rows = productDao.getRows(produto);

                if(rows > 1){
                    System.out.println("[" + rows + "] EAN: " + ean);
                }
            }
        }
        ConnectionU.close();

    }

    public void setPF17(JSONArray jsonArray){
        if (Boolean.TRUE.equals(ConnectionU.connect())) {
            produto = new Produto();
            for (Object object : jsonArray) {
                String pf17 = ((JSONObject) object).getString("PF_17");
                String ean = ((JSONObject) object).getString("EAN");

                if (!pf17.equals("0.00")) {
                    produto.setEAN(ean);
                    produto.setPF_17(pf17);
                    Integer i = productDao.setPF17(produto);
                    if (i > 0) {
                        System.out.println("[" + i + "] EAN: " + produto.getEAN() + " PF17: " + produto.getPF_17());
                    }
                }
                produto = new Produto();
            }
        }
        ConnectionU.close();
    }
}
