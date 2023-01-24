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
import org.si.rm.brac.brac_v0.Utilities.EncryptingHandler;
import org.si.rm.brac.brac_v0.Utilities.ValidationHandler;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxLoaderFactory;
import org.si.rm.brac.brac_v0.services.ProfileService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FXMLoaderService;

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
    private PasswordField password;

    @FXML
    private Button signInBtn;

    @FXML
    private TextField userName;

    @FXML
    void ExitButton(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {

        ValidationHandler validationHandler = new ValidationHandler();
        validationHandler.add(userName.getText()).add(password.getText());

        boolean successValidation = validationHandler.validateFields();

        if(successValidation)
            {
                EncryptingHandler encryptingHandler = new EncryptingHandler();
                String encrypted_password = encryptingHandler.Encrypt(password.getText());

                AuthentificationHandler authentificationHandler = new AuthentificationHandler();
                boolean success = authentificationHandler.checkAccess(userName.getText(),encrypted_password);

                if(success)
                {
                    ProfileService profile = new ProfileService(userName.getText(),authentificationHandler.getROLE(),encrypted_password);
                    Lookup.getInstance().register(ProfileService.class,profile);

                    ((FXMLoaderService)((FxmlLoaderBuilder)Lookup.getInstance().getService(FxLoaderFactory.class).get(authentificationHandler.getROLE()))
                            .setResource()
                            .setCSS()
                            .setParent(null)
                            .build()).load();

                }

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
