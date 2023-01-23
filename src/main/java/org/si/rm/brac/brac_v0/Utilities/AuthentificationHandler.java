package org.si.rm.brac.brac_v0.Utilities;

import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.models.Fxmodels.LoginInformation;
import org.si.rm.brac.brac_v0.others.bulders.HttpClientServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database.AuthentificationServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.DataBaseRespondHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.DataBaseHttpClient;
import org.si.rm.brac.brac_v0.services.httpClientServices.HttpClientService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class AuthentificationHandler implements Utility{
    private String USERNAM = "";
    private String PASSWORD = "";

    public AuthentificationHandler(String USERNAM, String PASSWORD) {
        this.USERNAM = USERNAM;
        this.PASSWORD = PASSWORD;
    }

    @Override
    public void run() {
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
            DataBaseHttpClient httpClientService =(DataBaseHttpClient) builder.createConnection().setRequest(request).setErrorHandler(new DataBaseRespondHandler()).build();
            LoginInformation model = (LoginInformation) httpClientService.get();

            if(model.getPassword().equals(PASSWORD))
            {
            }
        } catch (NotAmethod e) {
            e.printStackTrace();
        }


    }
}
