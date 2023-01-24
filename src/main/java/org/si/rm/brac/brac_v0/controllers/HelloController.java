package org.si.rm.brac.brac_v0.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.Utilities.AuthentificationHandler;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders.HomeLoaderBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxmlLoaderFactory;
import org.si.rm.brac.brac_v0.services.ProfileService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.HomeLoader;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        AuthentificationHandler authentificationHandler = new AuthentificationHandler();
        boolean success = authentificationHandler.checkAccess("mehdi begh54","mehdi123");

        if(success)
        {
            ProfileService profile = new ProfileService("mehdi begh54",authentificationHandler.getROLE(),"mehdi123");
            Lookup.getInstance().register(ProfileService.class,profile);

            ((HomeLoader)((HomeLoaderBuilder)Lookup.getInstance().getService(FxmlLoaderFactory.class).get("Home"))
                    .setParent()
                    .setResource()
                    .setCSS()
                    .build()).load();

        }
    }
}