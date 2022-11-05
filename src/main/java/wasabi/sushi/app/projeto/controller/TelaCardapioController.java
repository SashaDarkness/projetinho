package wasabi.sushi.app.projeto.controller;

import wasabi.sushi.app.projeto.aplication.main;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

//import javafx.scene.Node;
import org.w3c.dom.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
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
    private Pane tela = new Pane();

    private final List<Node> children = new ArrayList<>();

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }
    private void initializeNodes() {
        //lblUser.setText(Main.getDataUser().getNome());
        //getDateSystem();
    }

    private void promocao(Event event){
        loadView(ResourceStage.currentStage(event),
                "src/main/resources/wasabi.sushi.app/view/telapromocao.fxml",
                "Promoção", (PromocaoController controller) -> {
                // controller.updateTableView();
        });
    }

    private void entrada(Event event){
        loadView(ResourceStage.currentStage(event),
                "src/main/resources/wasabi.sushi.app/view/telaentrada.fxml",
                "Entradas", (PromocaoController controller) -> {

                });
    }
    private void temaki(Event event){
        loadView(ResourceStage.currentStage(event),
                "src/main/resources/wasabi.sushi.app/view/telatemakiespecial.fxml",
                "Temaki Especial", (PromocaoController controller) -> {

                });
    }
    private void holl(Event event){
        loadView(ResourceStage.currentStage(event),
                "src/main/resources/wasabi.sushi.app/view/telahollwasabi.fxml",
                "Holl Wasabi", (PromocaoController controller) -> {

                });
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
    private void onBtActionTrocarTela() throws IOException {
        main.changeScene("Principal");
    }
}
