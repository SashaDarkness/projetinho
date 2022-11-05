package wasabi.sushi.app.projeto.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("/wasabi/sushi/app/projeto/view/telaprincipal.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("/wasabi/sushi/app/projeto/view/telacadastro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("Wasabi Sushi App");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}