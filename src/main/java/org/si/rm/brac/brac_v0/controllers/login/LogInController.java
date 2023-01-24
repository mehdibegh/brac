package org.si.rm.brac.brac_v0.controllers.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.Utilities.AuthentificationHandler;
import org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders.FormulationHomeLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxmlLoaderFactory;
import org.si.rm.brac.brac_v0.services.ProfileService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FormulationHomeLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    @FXML
    private AnchorPane BigAnchor;

    @FXML
    private Button ExitButton;

    @FXML
    private AnchorPane LeftAnchor;

    @FXML
    private AnchorPane RightAnchor;

    @FXML
    private VBox TopRightVbox;

    @FXML
    private AnchorPane infoAnchor;

    @FXML
    private Text leftanchor;

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField passworld;

    @FXML
    private Button signInBtn;

    @FXML
    private TextField userName;

    @FXML
    void ExitButton(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {
        AuthentificationHandler authentificationHandler = new AuthentificationHandler();
        boolean success = authentificationHandler.checkAccess(userName.getText(),"mehdi123");

        if(success)
        {
            ProfileService profile = new ProfileService("mehdi begh54",authentificationHandler.getROLE(),"mehdi123");
            Lookup.getInstance().register(ProfileService.class,profile);

            ((FormulationHomeLoader)((FormulationHomeLoaderBuilder)Lookup.getInstance().getService(FxmlLoaderFactory.class).get("Formulation Home"))
                    .setParent()
                    .setResource()
                    .setCSS()
                    .build()).load();

        }
    }

    @FXML
    void signIn(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void validateFields()
    {

    }
}
