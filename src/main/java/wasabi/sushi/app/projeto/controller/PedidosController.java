package wasabi.sushi.app.projeto.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import wasabi.sushi.app.projeto.aplication.Main;
import wasabi.sushi.app.projeto.banco.ProdutoEntity;
import wasabi.sushi.app.projeto.service.PedidoService;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PedidosController implements Initializable {

    PedidoService service;

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
    private TableView<ProdutoEntity> tabelaPedidos;
    @FXML
    private TableColumn<ProdutoEntity, String> columnPrato;
    @FXML
    private TableColumn<ProdutoEntity, String> columnTipo;
    @FXML
    private TableColumn<ProdutoEntity, Double> columnValor;
    @FXML
    private TableColumn<ProdutoEntity, ProdutoEntity> columnEditar;
    @FXML
    private TableColumn<ProdutoEntity, ProdutoEntity> columnAlterar;
    @FXML
    private Button btnVoltar;
    @FXML
    private TableColumn<ProdutoEntity, ProdutoEntity> columnDeletar;

    public void setService(PedidoService service) {
        this.service = service;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void pedidosRealizados(){

    }


    @FXML
    private void onBtnVoltarTelaInicial(){
        Main.changeScreen("main");
    }

}
