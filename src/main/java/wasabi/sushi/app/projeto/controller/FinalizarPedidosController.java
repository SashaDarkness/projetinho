package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import wasabi.sushi.app.projeto.aplication.Main;
import wasabi.sushi.app.projeto.banco.ProdutoEntity;

import java.net.URL;
import java.util.ResourceBundle;

public class FinalizarPedidosController implements Initializable {
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtEmail;
    @FXML
    private CheckBox btnDinheiro;
    @FXML
    private CheckBox btnCartao;
    @FXML
    private TextField txtNumeroCartao;
    @FXML
    private TextField txtValortotal;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnFinalizarCompra;
    @FXML
    private TableView<ProdutoEntity> tabelaFinal;
    @FXML
    private TableColumn<ProdutoEntity, String> columnPrato;
    @FXML
    private TableColumn<ProdutoEntity, String> columnTipo;
    @FXML
    private TableColumn<ProdutoEntity, Double> columnValor;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void onBtnVoltarTelaInicial(ActionEvent e){
        Main.changeScreen("main");
    }
}
