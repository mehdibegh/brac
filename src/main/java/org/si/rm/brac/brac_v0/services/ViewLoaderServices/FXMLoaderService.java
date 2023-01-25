package org.si.rm.brac.brac_v0.services.ViewLoaderServices;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.si.rm.brac.brac_v0.Launcher;

import java.io.IOException;

public class FXMLoaderService {
    private  String FXML_resource = "";
    private  String CSS_resource = "";
    private  Parent parent = null;
    private double x,y=0;
    public void load() {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource(FXML_resource));
        if(parent == null)
        {
            try {
                parent  = fxmlLoader.load();
                Scene scene = new Scene(parent,894, 632);
                scene.getStylesheets().add(Launcher.class.getResource(CSS_resource).toExternalForm());
                Stage stage=new Stage();
                stage.setTitle("Hello!");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.initStyle(StageStyle.UNDECORATED);
                parent.setOnMousePressed(evnt -> {
                    x = evnt.getSceneX();
                    y = evnt.getSceneY();
                });
                parent.setOnMouseDragged(evnt -> {
                    stage.setX(evnt.getScreenX() - x);
                    stage.setY(evnt.getScreenY() - y);
                });
                stage.isFocused();
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        if(((AnchorPane)parent).getChildren().size()>0) ((AnchorPane)parent).getChildren().remove(0);

        try {
            ((AnchorPane)parent).getChildren().add(fxmlLoader.load());
            ((AnchorPane)parent).getStylesheets().add(Launcher.class.getResource(CSS_resource).toExternalForm());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFXML_resource(String FXML_resource) {
        this.FXML_resource = FXML_resource;
    }

    public void setCSS_resource(String CSS_resource) {
        this.CSS_resource = CSS_resource;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
