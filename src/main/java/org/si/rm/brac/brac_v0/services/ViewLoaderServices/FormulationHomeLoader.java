package org.si.rm.brac.brac_v0.services.ViewLoaderServices;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import org.si.rm.brac.brac_v0.Launcher;

import java.io.IOException;

public class FormulationHomeLoader implements FxmlLoaderService{
    private String FXMLresource = "";
    private String CSSresource = "";
    private Parent parent = null;

    @Override
    public void load() {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource(FXMLresource));
        if(((AnchorPane)parent).getChildren().size()>0) ((AnchorPane)parent).getChildren().remove(0);

        try {
            ((AnchorPane)parent).getChildren().add(fxmlLoader.load());
            ((AnchorPane)parent).getStylesheets().add(Launcher.class.getResource(CSSresource).toExternalForm());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFXMLresource() {
        return FXMLresource;
    }

    public void setFXMLresource(String FXMLresource) {
        this.FXMLresource = FXMLresource;
    }

    public String getCSSresource() {
        return CSSresource;
    }

    public void setCSSresource(String CSSresource) {
        this.CSSresource = CSSresource;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
