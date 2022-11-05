package wasabi.sushi.app.projeto.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class PromocaoController  implements Initializable {
    @FXML
    private Button addProm01;
    @FXML
    private Button addProm02;
    @FXML
    private Button addProm03;
    @FXML
    private Button addProm04;
    @FXML
    private Pane telapromocao;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        telapromocao.getChildren();
    }

}
