package com.example.calculadoraequipo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.io.IOException;

public class Multiplicacion {

@FXML
private Label labResulMulti;
@FXML
private TextField txtNumero1;
@FXML
private TextField txtNumero2;
@FXML
private Button  btnResulMulti;

@FXML
    protected void resultado(ActionEvent event) throws IOException {


        double num1 = Double.parseDouble(txtNumero1.getText());
        double num2 = Double.parseDouble(txtNumero2.getText());
        double result = num1 * num2;
        labResulMulti.setText("El resultado es " + result );
    }
}
