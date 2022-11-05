package wasabi.sushi.app.projeto.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CadastroController implements Initializable {
    @FXML
    private TextField nome;
    @FXML
    private TextField endereco;
    @FXML
    private TextField telefone;
    @FXML
    private TextField email;
    @FXML
    private RadioButton cartao;
    @FXML
    private RadioButton dinheiro;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
