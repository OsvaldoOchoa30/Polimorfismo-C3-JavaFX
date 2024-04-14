package org.osvaldoochoa.polimorfismoc3.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.osvaldoochoa.polimorfismoc3.App;
import org.osvaldoochoa.polimorfismoc3.models.Student;
import java.io.IOException;



public class CrearEstudianteController {

    Stage callSu = new Stage();
    private Student student;

    public void setStudent(Student student) {
    }

    @FXML
    private Button buttonBacktoMenu;

    @FXML
    private Button buttonGuardar;

    @FXML
    private TextField edadEstudiante;

    @FXML
    private TextField idEstudiante;

    @FXML
    private TextField nombreEstudiante;

    @FXML
    void buttonGuardar(MouseEvent event) {

    }

    @FXML
    void onMouseClickedbuttonBacttoMenu(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("principal-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            PrincipalController principalController = fxmlLoader.getController();
            principalController.setStudent(student);
            callSu.setTitle("Menu");
            callSu.setScene(scene);
            callSu.show();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    }


