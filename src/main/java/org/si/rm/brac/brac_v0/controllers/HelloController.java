package org.si.rm.brac.brac_v0.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.si.rm.brac.brac_v0.Utilities.AuthentificationHandler;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        AuthentificationHandler authentificationHandler = new AuthentificationHandler("mehdi Begh","mehdi123");
        authentificationHandler.run();
    }
}