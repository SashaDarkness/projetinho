package wasabi.sushi.app.projeto.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    private static Stage stage;
    private static Scene telaprincipalScene;
    private static Scene cadastrarScene;
    private static Scene cardapioScene;
    private static Scene listarpedidosScene;
    private static Scene finalizarScene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/wasabi/sushi/app/projeto/view/telaprincipal.fxml"));
        telaprincipalScene =  new Scene(fxmlMain,600,500);

        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("/wasabi/sushi/app/projeto/view/telacadastro.fxml"));
        cadastrarScene =  new Scene(fxmlCadastro,600,400);

        Parent fxmlCardapio = FXMLLoader.load(getClass().getResource("/wasabi/sushi/app/projeto/view/telacardapio.fxml"));
        cardapioScene =  new Scene(fxmlCardapio,600,550);

        Parent fxmlListar = FXMLLoader.load(getClass().getResource("/wasabi/sushi/app/projeto/view/listarpedidos.fxml"));
        listarpedidosScene =  new Scene(fxmlListar,600,600);

        Parent fxmlFinalizarCompra = FXMLLoader.load(getClass().getResource("/wasabi/sushi/app/projeto/view/telapagamento.fxml"));
        finalizarScene =  new Scene(fxmlFinalizarCompra,600,600);


        primaryStage.setTitle("Wasabi Sushi App");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("C:\\Users\\Darkness\\Downloads\\projeto_wasabiApp - Copia\\projeto\\src\\main\\resources\\wasabi\\sushi\\app\\projeto\\imagem\\iconwasabi.png"));
        primaryStage.setTitle("Sistema de Triagem Mark Caeiro");
        primaryStage.setScene(telaprincipalScene);
        primaryStage.show();

    }

    public static void changeScreen(String tela) {
        switch (tela) {
            case "main":
                stage.setScene(telaprincipalScene);
                break;
            case "cadastrar":
                stage.setScene(cadastrarScene);
                break;
            case "cardapio":
               stage.setScene(cardapioScene);
               break;
            case "listarpedidos":
                stage.setScene(listarpedidosScene);
                break;
            case "finalizarpagamento":
                stage.setScene(finalizarScene);

        }
    }


}