package br.inf.cs.data.daoImpl;

import br.inf.cs.data.DataSource;
import br.inf.cs.data.dao.GenericDao;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.Produto;
import org.apache.commons.lang3.NotImplementedException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDaoImpl implements GenericDao<Produto> {

    @Override
    public void create(Produto produto) {
        throw new NotImplementedException("Method is not implemented");
    }

    @Override
    public Produto findByCod(Integer cod) {
        throw new NotImplementedException("Method is not implemented");
    }

    @Override
    public void delete(Integer cod) {
        throw new NotImplementedException("Method is not implemented");
    }

    @Override
    public void update(Produto produto) {
        String query = "UPDATE produto SET preco_fabricante = ?, codigo_ncm = ?, data_ultima_alteracao = GETDATE() WHERE codigo = ? and aliquota_abc_farma = ?;";

        try{
            PreparedStatement pstmt = DataSource.connection.prepareStatement(query);
            pstmt.setDouble(1, produto.getPreco_fabricante());
            pstmt.setString(2, produto.getCodigo_ncm());
            pstmt.setString(3, produto.getCodigo());
            pstmt.setDouble(4, produto.getAliquota_abc_farma());
            pstmt.executeUpdate();
        }catch (Exception e){
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public List<Produto> findAll() {
        throw new NotImplementedException("Method is not implemented");
    }

    public List<Produto> findByCodigoBarra(Long ean){
        String query = "SELECT codigo, nome, codigo_barra, quantidade_estoque, codigo_ncm, aliquota_abc_farma, preco_fabricante FROM produto WHERE Codigo_barra = ?";
        try {
            PreparedStatement pstmt = DataSource.connection.prepareStatement(query);
            pstmt.setString(1, ean.toString());
            ResultSet rs = pstmt.executeQuery();
            if (rs != null) {
                Produto produto;
                List<Produto> list = new ArrayList<>();
                while (rs.next()) {
                    produto = new Produto();
                    produto.setCodigo(rs.getString("codigo"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCodigo_barra(rs.getLong("codigo_barra"));
                    produto.setQuantidade_estoque(rs.getFloat("quantidade_estoque"));
                    produto.setCodigo_ncm(rs.getString("codigo_ncm"));
                    produto.setAliquota_abc_farma(rs.getDouble("aliquota_abc_farma"));
                    produto.setPreco_fabricante(rs.getDouble("preco_fabricante"));
                    list.add(produto);
                }
                return list;
            }
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return null;
    }
}
