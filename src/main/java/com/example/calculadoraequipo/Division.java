package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Division {

@FXML
private Label labResulDivi;
@FXML
private TextField txtNumero1;
@FXML
private TextField txtNumero2;
@FXML
private Button  btnResulDivi;

@FXML
    protected void resultado(ActionEvent event) throws IOException {


        double num1 = Double.parseDouble(txtNumero1.getText());
        double num2 = Double.parseDouble(txtNumero2.getText());
        double result = num1 / num2;
        labResulDivi.setText("El resultado es " + result );
    }

    @FXML
    protected void regresar(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Ventana division");
        stage.show();
    }

}
