package com.example.todolist.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    @FXML
    private AnchorPane context;

    @FXML
    void btnGetStartedOnAction(ActionEvent event) {
        context.getChildren().clear();
        Stage stage = (Stage) context.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ListForm.fxml"))));
            stage.setTitle("To Do List");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
