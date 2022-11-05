package wasabi.sushi.app.projeto.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

//import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.w3c.dom.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import wasabi.sushi.app.projeto.aplication.Main;
import wasabi.sushi.app.projeto.utils.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class TelaCardapioController implements Initializable {
    @FXML
    private Button btnPromocao;

    @FXML
    private Button btnEntradas;

    @FXML
    private Button btnTemaki;

    @FXML
    private Button btnHoll;

    @FXML
    private Button btnVoltar;

    @FXML
    private Pane tela;
    @FXML
    private Pane telacardapio;

    private final List<Node> children = new ArrayList<>();

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }
    private void initializeNodes() {

    }

    //ACTION DE ATALHO DE TECLAS
    @FXML
    private void handleOnKeyReleased(KeyEvent event){
        if(event.getCode() == KeyCode.F2){
            promocao(event);
        }
        if(event.getCode() == KeyCode.F3){
           entrada(event);
        }
        if(event.getCode() == KeyCode.F4){
            temaki(event);
        }
        if (event.getCode() == KeyCode.F5){
            holl(event);
        }
    }

    private void promocao(Event event){
        loadView(ResourceStage.currentStage(event),
                "/wasabi/sushi/app/projeto/view/telapromocao.fxml",
                "Promoção", (PromocaoController controller) -> {

        });
    }

    private void entrada(Event event){
        loadView(ResourceStage.currentStage(event),
                "/wasabi/sushi/app/projeto/view/telaentradas.fxml",
                "Entradas", (EntradaController controller) -> {

                });
    }
    private void temaki(Event event){
        loadView(ResourceStage.currentStage(event),
                "/wasabi/sushi/app/projeto/view/telatemakiespecial.fxml",
                "Temaki Especial", (TemakiEspecialController controller) -> {

                });
    }
    private void holl(Event event){
        loadView(ResourceStage.currentStage(event),
                "/wasabi/sushi/app/projeto/view/telahollwasabi.fxml",
                "Holl Wasabi", (HollWasabiController controller) -> {
                    //controller.setServices(new ClienteService());
                });
    }

    @FXML
    private void onBtActionPromocao(ActionEvent event) {
        promocao(event);
    }
    @FXML
    private void onBtActionEntrada(ActionEvent event) {
        entrada(event);
    }
    @FXML
    private void onBtActionTemaki(ActionEvent event) {
        temaki(event);
    }
    @FXML
    private void onBtActionHoll(ActionEvent event) {
        holl(event);
    }

    private synchronized <T> void loadView(Stage parentStage, String absolutName, String title, Consumer<T> initializingAction) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
            Pane pane = loader.load();

            tela.getChildren().addAll(pane);

            T controller = loader.getController();
            initializingAction.accept(controller);
            DialogForm.createDialogForm(pane, title, parentStage);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    @FXML
    private void onBtnVoltarTelaInicial() throws IOException {
        Main.changeScreen("main");
    }

}
