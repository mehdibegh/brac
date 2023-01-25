package org.si.rm.brac.brac_v0.controllers.home.Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxLoaderFactory;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FXMLoaderService;

public class AdministrationHomeController {
    @FXML
    private Button ExitButton;

    @FXML
    private Pane SSE;

    @FXML
    private Pane SSF;

    @FXML
    void ExitButton(ActionEvent event) {
        Stage stage=(Stage) ExitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void loadSSE(MouseEvent event) {
        ((FXMLoaderService)((FxmlLoaderBuilder) Lookup.getInstance().getService(FxLoaderFactory.class).get("AGENT_DE_FORMULATION"))
                .setResource()
                .setCSS()
                .setParent(null)
                .build()).load();

        ExitButton(null);
    }

    @FXML
    void loadSSF(MouseEvent event) {
        ((FXMLoaderService)((FxmlLoaderBuilder) Lookup.getInstance().getService(FxLoaderFactory.class).get("AGENT_D_EXPLOITATION"))
                .setResource()
                .setCSS()
                .setParent(null)
                .build()).load();

        ExitButton(null);
    }
}
