package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import wasabi.sushi.app.projeto.aplication.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class PedidosController implements Initializable {
    @FXML
    private Button btnVoltar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void pedidosRealizados(){

    }


    @FXML
    private void onBtnVoltarTelaInicial(ActionEvent e){
        Main.changeScreen("main");
    }

}
