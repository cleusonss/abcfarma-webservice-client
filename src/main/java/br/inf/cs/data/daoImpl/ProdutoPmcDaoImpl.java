package br.inf.cs.daoImpl;

import br.inf.cs.dao.GenericDao;
import br.inf.cs.data.DataSource;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.ProdutoPmc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoPmcDaoImpl implements GenericDao<ProdutoPmc> {

    @Override
    public void create(ProdutoPmc produtoPmc) {
        String query = "INSERT INTO produto_pmc (prod_cod, aliquota, preco_maximo_consumidor, ultima_alteracao) VALUES (?, ?, ?, ?);";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, produtoPmc.getProd_cod());
            pstmt.setFloat(2, produtoPmc.getAliquota());
            pstmt.setFloat(3, produtoPmc.getPreco_maximo_consumidor());
            pstmt.setDate(4, produtoPmc.getUltima_alteracao());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public ProdutoPmc findByCod(Integer cod) {
        String query = "SELECT prod_cod, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc WHERE prod_cod = ?";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, cod);
            ResultSet rs = pstmt.executeQuery();
            if (rs != null) {
                ProdutoPmc produtoPmc = new ProdutoPmc();
                while (rs.next()) {
                    produtoPmc = new ProdutoPmc();
                    produtoPmc.setProd_cod(rs.getInt("prod_cod"));
                    produtoPmc.setAliquota(rs.getFloat("aliquota"));
                    produtoPmc.setPreco_maximo_consumidor(rs.getFloat("preco_maximo_consumidor"));
                    produtoPmc.setUltima_alteracao(rs.getDate("ultima_alteracao"));
                }
                return produtoPmc;
            }
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return null;
    }

    public ProdutoPmc findByCodAndAliquota(Integer cod, Float aliquota) {
        String query = "SELECT prod_cod, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc WHERE prod_cod = ? and aliquota = ?";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, cod);
            pstmt.setFloat(2, aliquota);
            ResultSet rs = pstmt.executeQuery();
            if (rs != null) {
                ProdutoPmc produtoPmc = new ProdutoPmc();
                while (rs.next()) {
                    produtoPmc = new ProdutoPmc();
                    produtoPmc.setProd_cod(rs.getInt("prod_cod"));
                    produtoPmc.setAliquota(rs.getFloat("aliquota"));
                    produtoPmc.setPreco_maximo_consumidor(rs.getFloat("preco_maximo_consumidor"));
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
    public void delete(Integer prod_cod) {
        String query = "DELETE FROM produto_pmc WHERE prod_cod = ?";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setInt(1, prod_cod);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public void update(ProdutoPmc produtoPmc) {
        String query = "UPDATE produto_pmc SET preco_maximo_consumidor = ?, ultima_alteracao = GETDATE() WHERE prod_codigo = ? AND aliquota = ?;";
        try (PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query)) {
            pstmt.setFloat(1, produtoPmc.getPreco_maximo_consumidor());
            pstmt.setInt(2, produtoPmc.getProd_cod());
            pstmt.setFloat(3, produtoPmc.getAliquota());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
    }

    @Override
    public List<ProdutoPmc> findAll() {
        List<ProdutoPmc> all = new ArrayList<>();
        String query = "SELECT prod_cod, aliquota, preco_maximo_consumidor, ultima_alteracao FROM produto_pmc";
        try {
            ResultSet rs = DataSource.executeQuery(query);
            ProdutoPmc produtoPmc;
            if (rs != null) {
                while (rs.next()) {
                    produtoPmc = new ProdutoPmc();
                    produtoPmc.setProd_cod(rs.getInt("prod_cod"));
                    produtoPmc.setAliquota(rs.getFloat("aliquota"));
                    produtoPmc.setPreco_maximo_consumidor(rs.getFloat("preco_maximo_consumidor"));
                    produtoPmc.setUltima_alteracao(rs.getDate("ultima_alteracao"));
                    all.add(produtoPmc);
                }
            }
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }
        return all;
    }
}
