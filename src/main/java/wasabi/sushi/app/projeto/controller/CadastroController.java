package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import wasabi.sushi.app.projeto.aplication.Main;
import wasabi.sushi.app.projeto.service.ClienteService;

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
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnFinalizar;
    @FXML
    private TextField idNumeroCartao;
    @FXML
    private TextField cpf;

    ClienteService cliente = new ClienteService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

//    private void cadastrar(Event e){
//        cliente.adicionarCliente(
//                nome.getText()
//                ,Integer.parseInt(cpf.getText())
//                , endereco.getText()
//                ,email.getText()
//                ,telefone.getText()
//        );
//    }
    @FXML
    private void onBtnFinalizar(ActionEvent e){
//        cadastrar(e);
    }

    @FXML
    private void onBtnVoltarTelaInicial(ActionEvent e){
        Main.changeScreen("main");
    }


}
