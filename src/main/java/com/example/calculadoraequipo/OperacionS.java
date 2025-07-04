package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class OperacionS {
    @FXML
    private Label lblResultado;
    @FXML
    private Button btnSumar;
    @FXML
    private TextField txtPrimerValor;
    @FXML
    private TextField txtSegundoValor;

    @FXML
    private void sumar() throws IOException {

        double num1 = Double.parseDouble(this.txtPrimerValor.getText());
        double num2 = Double.parseDouble(this.txtSegundoValor.getText());
        double resultado = num1 + num2;
        this.lblResultado.setText("El resultado es: " + resultado);

    }
}
