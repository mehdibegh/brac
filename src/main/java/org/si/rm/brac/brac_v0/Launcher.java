package org.si.rm.brac.brac_v0;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.si.rm.brac.brac_v0.others.bulders.AlertServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.others.factories.FxModelsFactory;
import org.si.rm.brac.brac_v0.others.factories.FxLoaderFactory;

import java.io.IOException;


public class Launcher extends Application {
    private double x,y=0;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("LoginInterface.fxml"));
        Parent root=fxmlLoader.load();
        Scene scene = new Scene(root, 765, 566);
        scene.getStylesheets().add(Launcher.class.getResource("styles/login.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(evnt -> {
            x = evnt.getSceneX();
            y = evnt.getSceneY();
        });
        root.setOnMouseDragged(evnt -> {
            stage.setX(evnt.getScreenX() - x);
            stage.setY(evnt.getScreenY() - y);
        });
        stage.isFocused();
        stage.show();

    }

    public static void main(String[] args) throws IOException{
        FxHttpClientFactory fxHttpClientFactory = new FxHttpClientFactory();
        Lookup.getInstance().register(FxHttpClientFactory.class,fxHttpClientFactory);

        FxLoaderFactory fxLoaderFactory = new FxLoaderFactory();
        Lookup.getInstance().register(FxLoaderFactory.class, fxLoaderFactory);

        FxModelsFactory fxModelsFactory = new FxModelsFactory();
        Lookup.getInstance().register(FxModelsFactory.class, fxModelsFactory);

        AlertServiceBuilder alertServiceBuilder = new AlertServiceBuilder();
        Lookup.getInstance().register(AlertServiceBuilder.class, alertServiceBuilder);


        launch();

    }
}