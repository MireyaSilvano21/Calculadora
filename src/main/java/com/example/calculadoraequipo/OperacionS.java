package com.example.calculadoraequipo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
