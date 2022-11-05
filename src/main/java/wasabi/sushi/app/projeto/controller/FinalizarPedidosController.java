package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import wasabi.sushi.app.projeto.aplication.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class FinalizarPedidosController implements Initializable {
    @FXML
    private TextField field_nome;
    @FXML
    private TextField field_endereco;
    @FXML
    private TextField field_email;
    @FXML
    private TextField field_telefone;
    @FXML
    private RadioButton btnDinheiro;
    @FXML
    private RadioButton btnCartaoCredito;
    @FXML
    private TextField idNumeroCartao;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnFinalizar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void onBtnVoltarTelaInicial(ActionEvent e){
        Main.changeScreen("main");
    }
}
