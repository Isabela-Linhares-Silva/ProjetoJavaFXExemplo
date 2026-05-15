package com.aula.projetojavafxexemplo.controller;

import com.aula.projetojavafxexemplo.Application;
import javafx.fxml.FXML;
import java.io.IOException;

public class ApplicationController {
    @FXML
    protected void onBuscarTurmaClicked(){
        Application.criarTela("buscar-turma-view.fxml");
    }
    @FXML
    protected void onCadastrarTurmaClicked(){
        Application.criarTela("cadastrar-turma-view.fxml");
    }
}
