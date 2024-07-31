/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.projectbasecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ngo
 */

public class MainLandingController implements Initializable {

    @FXML
    private TextField TextField;
    @FXML
    private Label label;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void actionBinary(ActionEvent event) {
        try {
            int number = Integer.parseInt(TextField.getText());
            String binary = Integer.toBinaryString(number);
            label.setText(binary);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("False input, not a number !!!");
            alert.showAndWait();
        }
    }

    @FXML
    private void actionHexadecimal(ActionEvent event) {
        try {
            int number = Integer.parseInt(TextField.getText());
            String hexadecimal = Integer.toHexString(number);
            label.setText(hexadecimal);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("False input, only numbers from 0-9 and A-F !!!");
            alert.showAndWait();
        }
    }

    @FXML
    private void actionOctal(ActionEvent event) {
        try {
            int number = Integer.parseInt(TextField.getText());
            String octalNumber = Integer.toOctalString(number);
            label.setText(octalNumber);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("False input !!!");
            alert.showAndWait();
        }
    }

    @FXML
    private void actionNextScreen(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("secondCalculator-view.fxml"));
            root = loader.load();
            
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Someting went wrong");
            alert.setContentText("Can't load a second Calculator");
            alert.showAndWait();
        }
        
    }

    @FXML
    private void actionExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void actionClear(ActionEvent event) {
        label.setText("No Input");
        TextField.setText("");
    }

}
