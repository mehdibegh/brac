package org.si.rm.brac.brac_v0.controllers.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import javafx.stage.Stage;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.Utilities.AuthentificationHandler;
import org.si.rm.brac.brac_v0.Utilities.EncryptingHandler;
import org.si.rm.brac.brac_v0.Utilities.ValidationHandler;
import org.si.rm.brac.brac_v0.others.bulders.AlertServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxLoaderFactory;
import org.si.rm.brac.brac_v0.services.ProfileService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FXMLoaderService;


public class LogInController {

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
        Stage stage=(Stage) ExitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void logIn(ActionEvent event) {

       ValidationHandler validationHandler = new ValidationHandler();
       validationHandler.add(userName.getText()).add(password.getText());

        boolean emptyFields = validationHandler.validateFields();

        if(!emptyFields)
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

                    ExitButton(null);

                }

            }else {
            ((Alert)Lookup.getInstance().getService(AlertServiceBuilder.class).createAlert(Alert.AlertType.WARNING)
                    .setMessage("حداري خانة معلومات فارغة ..!")
                    .setHeaderText("لم يتم ادخال كلمة السر او اسم المستخدم..!")
                    .setTitle("معالجة التسجيل")
                    .build()).show();
        }





    }

    @FXML
    void signIn(ActionEvent event) {

    }


}
