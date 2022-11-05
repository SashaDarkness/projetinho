package wasabi.sushi.app.projeto.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class main2 extends Application {
    private static Scene principalScene;
    private static Scene cardapioScene;
    private static Stage stage;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent fxmlLogin = FXMLLoader.load(Main.class.getResource("/wasabi/sushi/app/projeto/view/telacadastro.fxml"));
        principalScene = new Scene(fxmlLogin, 600, 500);

        primaryStage.setTitle("Wasabi Sushi App");
        primaryStage.setScene(principalScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private static void setScene() {
        try {
            //SplitPane fxmlHome = FXMLLoader.load(Main.class.getResource("/br/com/cdp/balanca/view/home.fxml"));
            BorderPane fxmlHome = FXMLLoader.load(Main.class.getResource("/wasabi/sushi/app/projeto/view/telacardapio.fxml"));
            cardapioScene = new Scene(fxmlHome);

            stage.setTitle("Wasabi Sushi App");
            stage.setScene(cardapioScene);
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeScene(String tela) {
        switch (tela) {
            case "Principal":
                stage.setScene(principalScene);
                stage.setMaximized(false);
                stage.setResizable(false);
                stage.setWidth(600);
                stage.setHeight(500);
                stage.show();
                break;
            case "Cardapio":
                setScene();
                break;
        }
    }

    public static Scene getScene() {
        return principalScene;
    }

    /*
    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("/wasabi/sushi/app/projeto/view/telaprincipal.fxml"));
        principalScene = new Scene(fxmlLoader.load(), 600, 500);

        primaryStage.setTitle("Wasabi Sushi App");
        primaryStage.setResizable(false);
        primaryStage.setScene(principalScene);
        primaryStage.show();
    }
    }*/

}