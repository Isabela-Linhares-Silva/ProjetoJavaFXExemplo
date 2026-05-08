package com.aula.projetojavafxexemplo.model.dao;

import com.aula.projetojavafxexemplo.db.DB;
import com.aula.projetojavafxexemplo.model.dao.impl.TurmaDaoJDBC;

public interface DaoFactory {
    public static TurmaDao createTurmaDao(){
        return new TurmaDaoJDBC(DB.getConnection());
    }
}
