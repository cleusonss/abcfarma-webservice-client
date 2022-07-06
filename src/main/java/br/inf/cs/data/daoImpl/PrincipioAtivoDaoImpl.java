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

package br.inf.cs.data.daoImpl;

import br.inf.cs.data.DataSource;
import br.inf.cs.data.dao.GenericDao;
import br.inf.cs.logging.Logger;
import br.inf.cs.model.PrincipioAtivo;
import org.apache.commons.lang3.NotImplementedException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrincipioAtivoDaoImpl implements GenericDao<PrincipioAtivo> {

    @Override
    public void create(PrincipioAtivo principioAtivo) {
        String query = "INSERT INTO principio_ativo (codigo, nome, dcb ,data_ultima_alteracao) values ((select top 1 codigo from principio_ativo order by codigo desc)+1, ?,?,GETDATE());";
        try{
            PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query);
            pstmt.setString(1, principioAtivo.getNome());
            pstmt.setString(2, principioAtivo.getDcb());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            Logger.warning(ProdutoPmcDaoImpl.class, e.getMessage());
        }

    }

    @Override
    public PrincipioAtivo findByCod(Integer cod) {
        throw new NotImplementedException("Method is not implemented");
    }

    @Override
    public void delete(Integer cod) {
        throw new NotImplementedException("Method is not implemented");
    }

    @Override
    public void update(PrincipioAtivo principioAtivo) {
        String query = "UPDATE principio_ativo SET nome = ?, dcb = ?, data_ultima_alteracao = GETDATE() WHERE codigo = ?;";
        try{
            PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query);
            pstmt.setString(1, principioAtivo.getNome());
            pstmt.setString(2, principioAtivo.getDcb());
            pstmt.setInt(3, principioAtivo.getCodigo());
            pstmt.executeUpdate();
            System.out.println(principioAtivo.getNome());
        }catch (Exception e){
            Logger.warning(PrincipioAtivoDaoImpl.class, e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public List<PrincipioAtivo> findAll() {
        throw new NotImplementedException("Method is not implemented");
    }

    public List<PrincipioAtivo> findByNome(String nome){
        String query = "SELECT * FROM principio_ativo WHERE nome = ?";
        List<PrincipioAtivo> list = new ArrayList<>();
        try{
            PreparedStatement pstmt = DataSource.getConnection().prepareStatement(query);
            pstmt.setString(1, nome);
            ResultSet rs = pstmt.executeQuery();

            if(rs != null){
                PrincipioAtivo principioAtivo;
                while (rs.next()){
                    principioAtivo = new PrincipioAtivo();
                    principioAtivo.setNome(rs.getString("nome"));
                    principioAtivo.setCodigo(rs.getInt("codigo"));
                    principioAtivo.setDataExclusao(rs.getDate("data_exclusao"));
                    principioAtivo.setDataUltimaAlteracao(rs.getDate("data_ultima_alteracao"));
                    principioAtivo.setDcb(rs.getString("dcb"));
                    list.add(principioAtivo);
                }
            }
        }catch (Exception e){
            Logger.warning(PrincipioAtivoDaoImpl.class, e.getMessage());
        }
        return list;
    }
}
