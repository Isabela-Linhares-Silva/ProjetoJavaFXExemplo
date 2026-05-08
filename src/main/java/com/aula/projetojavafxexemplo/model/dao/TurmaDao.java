package com.aula.projetojavafxexemplo.model.dao;

import com.aula.projetojavafxexemplo.model.entities.Turma;

import java.util.List;

public interface TurmaDao {
    public void insert(Turma t);
    public void update(Turma t);
    public void deleteByID(Integer id);
    public Turma findByID(Integer id);
    public List<Turma> findAll();


}
