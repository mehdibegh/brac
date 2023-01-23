package org.si.rm.brac.brac_v0.Utilities;

import javafx.scene.control.Alert;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.models.Fxmodels.LoginInformation;
import org.si.rm.brac.brac_v0.others.bulders.AlertServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database.AuthentificationServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.DataBaseHttpClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class AuthentificationHandler{
    private String USERNAM = "";
    private String PASSWORD = "";


    public boolean checkAccess(String usernam , String password)
    {
        this.USERNAM = usernam;
        this.PASSWORD = password;

        LoginInformation loginInformation = getLoginInformation();
        if (loginInformation != null && !loginInformation.getPassword().equals(PASSWORD))
        {
            ((Alert)Lookup.getInstance().getService(AlertServiceBuilder.class).createAlert(Alert.AlertType.INFORMATION)
                    .setMessage("عدرا يوجد خطا في كلمة السر ..!")
                    .setTitle("معالجة التسجيل")
                    .build()).show();
            return false ;
        }else{
            if(loginInformation != null) return true ;
        }
        return false;
    }

    public LoginInformation getLoginInformation() {
        String us = "";
        try {
            us = URLEncoder.encode(USERNAM, StandardCharsets.UTF_8.toString());
            us = us.replace("+","%20");

            System.out.println("USERNAM ENCODING:  "+us);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String[] request = {"/Login/"+us, "GET"};
        AuthentificationServiceBuilder builder = (AuthentificationServiceBuilder) Lookup.getInstance().getService(FxHttpClientFactory.class)
                .get("Authentification");

        try {
            DataBaseHttpClient httpClientService =(DataBaseHttpClient) builder.createConnection().setRequest(request).setErrorHandler(new ConnectionStatusCodeHandler()).build();
            LoginInformation model = (LoginInformation) httpClientService.get();

            return model;
        } catch (NotAmethod e) {
            e.printStackTrace();
        }

        return null;
    }
}
