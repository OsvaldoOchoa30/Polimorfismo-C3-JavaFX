package org.osvaldoochoa.polimorfismoc3.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.osvaldoochoa.polimorfismoc3.App;
import org.osvaldoochoa.polimorfismoc3.models.Student;

import java.io.IOException;

public class Bdd3Controller {
    public void setStudent(Student student) {
    }

    Stage callSu = new Stage();
    private Student student;



    @FXML
    private Button buttonBacktoMenu;

    @FXML
    void onMouseClickedbuttonBacttoMenu(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("principal-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            PrincipalController principalController = fxmlLoader.getController();
            principalController.setStudent(student);
            callSu.setTitle("Tacos");
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


