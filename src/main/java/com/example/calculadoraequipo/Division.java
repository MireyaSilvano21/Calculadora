package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
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
}
