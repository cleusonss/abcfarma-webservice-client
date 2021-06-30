package br.inf.cs.dao;

import br.inf.cs.data.ConnectionU;
import br.inf.cs.model.Produto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {

    public Integer setPMC17(Produto produto){
        StringBuilder sb = new StringBuilder();
        sb.append("update produto_pmc ");
        sb.append("set ");
        sb.append("preco_maximo_consumidor = %s, ");
        sb.append("ultima_alteracao = GETDATE() ");
        sb.append("where ");
        sb.append("prod_codigo = ");
        sb.append("(select distinct codigo from produto where codigo_barra = '%s') ");
        sb.append("and ");
        sb.append(" aliquota = 17;");

        String update = String.format(sb.toString(), produto.getPMC_17(), produto.getEAN());
        Integer rows = getRows(produto);
        if(rows == 1){
            return ConnectionU.executeUpdate(update);
        }else{
            if(rows > 1) {
                System.out.println("Error: EAN " + produto.getEAN() + "possui " + rows + "registros");
            }
            return 0;
        }
    }

    public Integer setPF17(Produto produto){
        StringBuilder sb = new StringBuilder();
        sb.append("update produto ");
        sb.append("set ");
        sb.append("preco_fabricante = %s, ");
        sb.append("data_ultima_alteracao = GETDATE() ");
        sb.append("where ");
        sb.append("codigo_barra = '%s'");
        sb.append("and ");
        sb.append(" aliquota_abc_farma = 17;");

        String update = String.format(sb.toString(), produto.getPF_17(), produto.getEAN());
        Integer rows = getRows(produto);
        if(rows == 1){
            return ConnectionU.executeUpdate(update);
        }
        else{
            if(rows > 1) {
                System.out.println("Error: EAN " + produto.getEAN() + "possui " + rows + "registros");
            }
            return 0;
        }
    }

    public Integer getRows(Produto produto){
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct codigo ");
        sb.append("from produto ");
        sb.append("where ");
        sb.append("codigo_barra = '%s'");

        String query = String.format(sb.toString(), produto.getEAN());
        
        try{
            ResultSet rs = ConnectionU.executeQuery(query);
            if (rs != null) {
                int i = 0;
                while(rs.next()){
                    i++;
                }
                return i;
            }
            return 0;
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
