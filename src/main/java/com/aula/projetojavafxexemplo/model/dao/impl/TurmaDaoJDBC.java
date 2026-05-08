package com.aula.projetojavafxexemplo.model.dao.impl;

import com.aula.projetojavafxexemplo.model.dao.TurmaDao;
import com.aula.projetojavafxexemplo.model.entities.Turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TurmaDaoJDBC implements TurmaDao {
    private Connection conn;

    public TurmaDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Turma t) {

    }

    @Override
    public void update(Turma t) {

    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public Turma findByID(Integer id) {
        PreparedStatement st = null;// faz injeção sql quando tem algo junto para "pesquisar"
        ResultSet rs = null;// recebe oq vem do banco
        try {
            st = conn.prepareStatement("select * from turma where id_turma =?");
            st.setInt(1,id);
            rs = st.executeQuery();// se guardar em alguma variavel vai retornar quantas linhas foram modificadas
            if(rs!= null){
                Turma t = new Turma(rs.getInt("id_turma"),rs.getString("nome"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Turma> findAll() {
        return List.of();
    }
}
