package org.si.rm.brac.brac_v0.controllers.home.Cformulation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders.FormulationHomeLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxmlLoaderFactory;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FormulationHomeLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class FormulationHomeController implements Initializable {
    @FXML
    private Pane GDDA;

    @FXML
    private AnchorPane ParentAnchorPane;

    @FXML
    private Pane RDAF;

    @FXML
    private Pane RDNF;

    @FXML
    private Label TB;


    @FXML
    void loadGDA(MouseEvent event) {
        ((FormulationHomeLoader)((FormulationHomeLoaderBuilder)Lookup.getInstance().getService(FxmlLoaderFactory.class).get("Formulation Home"))
                .setParent()
                .setResource()
                .setCSS()
                .build()).load();

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
