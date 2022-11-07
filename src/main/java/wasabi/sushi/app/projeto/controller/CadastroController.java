package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import wasabi.sushi.app.projeto.aplication.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class CadastroController implements Initializable {
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtNumeroCartao;
    @FXML
    private CheckBox cartao;
    @FXML
    private CheckBox dinheiro;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnCadastrar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void onBtnVoltarTelaInicial(){
        Main.changeScreen("main");
    }


}
