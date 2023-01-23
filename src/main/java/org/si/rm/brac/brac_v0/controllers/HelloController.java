package org.si.rm.brac.brac_v0.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.si.rm.brac.brac_v0.Utilities.AuthentificationHandler;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        AuthentificationHandler authentificationHandler = new AuthentificationHandler();
        boolean acces = authentificationHandler.checkAccess("mehdi begh","mehdi123");
        System.out.println(acces);
    }
}