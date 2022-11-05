module wasabi.sushi.app.projeto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    exports wasabi.sushi.app.projeto.aplication;
    opens wasabi.sushi.app.projeto.aplication to javafx.fxml;

    exports wasabi.sushi.app.projeto.controller;
    opens wasabi.sushi.app.projeto.controller to javafx.fxml;
}