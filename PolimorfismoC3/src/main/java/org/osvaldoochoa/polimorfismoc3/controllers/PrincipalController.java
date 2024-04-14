package org.osvaldoochoa.polimorfismoc3.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.osvaldoochoa.polimorfismoc3.App;
import org.osvaldoochoa.polimorfismoc3.models.Student;

import java.io.IOException;

public class PrincipalController {


    @FXML
    private Button buttomBDD2;

    @FXML
    private Button buttomBDD3;

    @FXML
    private Button buttonActualizar;

    @FXML
    private Button buttonAgregar;

    @FXML
    private Button buttonBDD1;

    Stage callSu = new Stage();
    private Student student;


    @FXML
    void onMouseClickedbuttonBacttoMenu(MouseEvent event) {

    }

    @FXML
    void onMouseClickedbuttonActualizar(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("modificarEstudiante-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
           ModificarEstudianteController modificarEstudianteController = fxmlLoader.getController();
            modificarEstudianteController.setStudent(student);
            callSu.setTitle("Actualizar Estudiante.");
            callSu.setScene(scene);
            callSu.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

    }

    @FXML
    void onMouseClickedbuttonAgregar(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("crearEstudiante-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
           CrearEstudianteController crearNuevoUsuarioController = fxmlLoader.getController();
            crearNuevoUsuarioController.setStudent(student);
            callSu.setTitle("Agregar Estudiante.");
            callSu.setScene(scene);
            callSu.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

    }

    @FXML
    void onMouseClickedbuttonBDD1(MouseEvent event) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("bdd1-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        Bdd1Controller bdd1Controller = fxmlLoader.getController();
        bdd1Controller.setStudent(student);
        callSu.setTitle("Base de Datos..");
        callSu.setScene(scene);
        callSu.show();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
        stage.close();


}

    @FXML
    void onMouseClickedbuttonBDD2(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("bdd2-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            Bdd2Controller bdd2Controller = fxmlLoader.getController();
            bdd2Controller.setStudent(student);
            callSu.setTitle("Resguardo 1 de la Base de Datos.");
            callSu.setScene(scene);
            callSu.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

    }

    @FXML
    void onMouseClickedbuttonBDD3(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("bdd3-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            Bdd3Controller bdd3Controller = fxmlLoader.getController();
            bdd3Controller.setStudent(student);
            callSu.setTitle("Resguardo 2 de la Base de Datos..");
            callSu.setScene(scene);
            callSu.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();


    }

    public void setStudent(Student student){
        this.student= student ;
    }

}
