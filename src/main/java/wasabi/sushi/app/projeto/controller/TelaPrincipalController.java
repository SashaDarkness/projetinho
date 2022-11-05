package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import wasabi.sushi.app.projeto.aplication.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class TelaPrincipalController implements Initializable {
    @FXML
    private Button btnCadastrarClientes;

    @FXML
    private Button btnConsultarCardapio;

    @FXML
    private Button btnListarPedidos;

    @FXML
    private Button btnFinalzarCompra;

    @FXML
    private Button btnSair;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    @FXML
    protected void actionCadastrarClientes(ActionEvent e){
        Main.changeScreen("cadastrar");
    }
    @FXML
    protected void actionCardapio(ActionEvent e){
        Main.changeScreen("cardapioScene");
    }
    @FXML
    protected void actionListarPedidos(ActionEvent e){
        Main.changeScreen("listarpedidos");
    }

    @FXML
    protected void actionFinalizarCompra(ActionEvent e){
        Main.changeScreen("finalizarpagamento");
    }


    @FXML
    protected void actionSairAplicacao(ActionEvent e){
        System.exit(0);
    }



}
