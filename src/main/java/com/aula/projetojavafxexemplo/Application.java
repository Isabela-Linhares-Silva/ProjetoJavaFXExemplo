package com.aula.projetojavafxexemplo;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("application-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pagina Inicial");
        stage.setScene(scene);
        stage.show();
    }

    public static Scene getScene(){//serve para quando for trabalhar com imagens
        return scene;
    }

    public static Scene criarTela(String url) {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(url));
        Stage stage = new Stage();
        try{
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Pagina Inicial");
        stage.setScene(scene);
        stage.show();

        return scene;
    }

    public static void main(String[] args) {
        javafx.application.Application.launch(Application.class, args);
    }
}