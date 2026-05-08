module com.aula.projetojavafxexemplo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.aula.projetojavafxexemplo to javafx.fxml;
    exports com.aula.projetojavafxexemplo;
    exports com.aula.projetojavafxexemplo.controller;
    opens com.aula.projetojavafxexemplo.controller to javafx.fxml;
}