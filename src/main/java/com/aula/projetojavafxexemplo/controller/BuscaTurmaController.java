package com.aula.projetojavafxexemplo.controller;

import com.aula.projetojavafxexemplo.model.dao.DaoFactory;
import com.aula.projetojavafxexemplo.model.entities.Turma;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BuscaTurmaController {
    @FXML
    private TextField codigoTurma;

    @FXML
    private Label nomeTurma;

    @FXML
    public void onBuscarClick(){
        Integer id = Integer.parseInt(codigoTurma.getText());
        Turma turma = DaoFactory.createTurmaDao().findByID(id);
        nomeTurma.setText(turma.getNome());
    };


}
