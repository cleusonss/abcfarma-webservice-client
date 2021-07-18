package br.inf.cs.data.daoImpl;

import br.inf.cs.data.dao.GenericDao;
import br.inf.cs.data.DataSource;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.ProdutoPmc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoPmcDaoImpl implements GenericDao<ProdutoPmc> {

    @Override
    public void create(ProdutoPmc produtoPmc) {
        String query = "INSERT INTO produto_pmc (prod_codigo, aliquota, preco_maximo_consumidor, ultima_alteracao) VALUES (?, ?, ?, GETDATE());";
        try{
            PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query);
            pstmt.setString(1, produtoPmc.getProd_cod());
            pstmt.setDouble(2, produtoPmc.getAliquota());
            pstmt.setDouble(3, produtoPmc.getPreco_maximo_consumidor());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public ProdutoPmc findByCod(Integer cod) {
        String query = "SELECT prod_codigo, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc WHERE prod_cod = ?";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, cod);
            ResultSet rs = pstmt.executeQuery();
            if (rs != null) {
                ProdutoPmc produtoPmc = new ProdutoPmc();
                while (rs.next()) {
                    produtoPmc = new ProdutoPmc();
                    produtoPmc.setProd_cod(rs.getString("prod_codigo"));
                    produtoPmc.setAliquota(rs.getDouble("aliquota"));
                    produtoPmc.setPreco_maximo_consumidor(rs.getDouble("preco_maximo_consumidor"));
                    produtoPmc.setUltima_alteracao(rs.getDate("ultima_alteracao"));
                }
                return produtoPmc;
            }
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return null;
    }

    @Override
    public void delete(Integer prod_codigo) {
        String query = "DELETE FROM produto_pmc WHERE prod_codigo = ?";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, prod_codigo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public void update(ProdutoPmc produtoPmc) {
        String query = "UPDATE produto_pmc SET preco_maximo_consumidor = ?, ultima_alteracao = GETDATE() WHERE prod_codigo = ? AND aliquota = ?;";
        try{
            PreparedStatement pstmt = DataSource.connection.prepareStatement(query);
            pstmt.setDouble(1, produtoPmc.getPreco_maximo_consumidor());
            pstmt.setString(2, produtoPmc.getProd_cod());
            pstmt.setDouble(3, produtoPmc.getAliquota());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public List<ProdutoPmc> findAll() {
        List<ProdutoPmc> list = new ArrayList<>();
        String query = "SELECT prod_codigo, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc";
        try {
            ResultSet rs = DataSource.executeQuery(query);
            list = getList(rs);
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return list;
    }

    public List<ProdutoPmc> findByCodigoAndAliquota(String codigo, double aliquota) {
        List<ProdutoPmc> list = new ArrayList<>();
        String query = "SELECT prod_codigo, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc WHERE prod_codigo = ? AND aliquota = ?";
        try {
            PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query);
            pstmt.setString(1, codigo);
            pstmt.setDouble(2, aliquota);
            ResultSet rs = pstmt.executeQuery();
            list = getList(rs);
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return list;
    }

    public boolean has(ProdutoPmc produtoPmc) {
        List<ProdutoPmc> list = findByCodigoAndAliquota(produtoPmc.getProd_cod(), produtoPmc.getAliquota());
        return list != null && list.size() > 0;
    }

    private List<ProdutoPmc> getList(ResultSet rs) throws SQLException {
        List<ProdutoPmc> list = new ArrayList<>();
        if (rs != null) {
            while (rs.next()) {
                ProdutoPmc produtoPmc = new ProdutoPmc();
                produtoPmc.setProd_cod(rs.getString("prod_codigo"));
                produtoPmc.setAliquota(rs.getDouble("aliquota"));
                produtoPmc.setPreco_maximo_consumidor(rs.getDouble("preco_maximo_consumidor"));
                produtoPmc.setUltima_alteracao(rs.getDate("ultima_alteracao"));
                list.add(produtoPmc);
            }
        }
        return list;
    }
}
