/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbasecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ngo
 */
public class SecondLandingController {

    @FXML
    private Label label;
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private void actionBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainLanding-view.fxml"));
            root = loader.load();

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Someting went wrong");
            alert.setContentText("Can't load a Base Convertion Calculator");
            alert.showAndWait();
        }
    }

    @FXML
    private void actionPlus(ActionEvent event) {
        int number1 = Integer.parseInt(firstNumber.getText());
        int number2 = Integer.parseInt(secondNumber.getText());

        int result = number1 + number2;

        label.setText(Integer.toString(result));
    }

    @FXML
    private void actionMinus(ActionEvent event) {
        int number1 = Integer.parseInt(firstNumber.getText());
        int number2 = Integer.parseInt(secondNumber.getText());

        int result = number1 - number2;

        label.setText(Integer.toString(result));
    }

    @FXML
    private void actionMulit(ActionEvent event) {
        int number1 = Integer.parseInt(firstNumber.getText());
        int number2 = Integer.parseInt(secondNumber.getText());

        int result = number1 * number2;

        label.setText(Integer.toString(result));
    }

    @FXML
    private void actionNextDivi(ActionEvent event) {
        int number1 = Integer.parseInt(firstNumber.getText());
        int number2 = Integer.parseInt(secondNumber.getText());

        int result = number1 / number2;

        label.setText(Integer.toString(result));
    }

    @FXML
    private void actionExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void actionClear(ActionEvent event) {
        firstNumber.clear();
        secondNumber.clear();
        label.setText("Result");
    }

}
