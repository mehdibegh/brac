package org.si.rm.brac.brac_v0.Utilities;

import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuildersImp.EncryptingServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.others.parsers.JsonRequestParser;
import org.si.rm.brac.brac_v0.others.parsers.PasswordEncryptingJsonCraetor;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.EncryptingHttpClient;

import java.util.ArrayList;
import java.util.HashMap;

public class EncryptingHandler {
    public String Encrypt(String password)
    {
        HashMap<String ,String > map = new HashMap<>();
        map.put("password",password);

        JsonRequestParser parser = new PasswordEncryptingJsonCraetor();
        String data = parser.create(map);

        String[] request = {"/RSA", "POST",data};

        EncryptingServiceBuilder encrypting = (EncryptingServiceBuilder) Lookup.getInstance().getService(FxHttpClientFactory.class).get("Encrypting");
        try {
            EncryptingHttpClient encryptingHttpClient = (EncryptingHttpClient) encrypting.createConnection().setRequest(request).setErrorHandler(new ConnectionStatusCodeHandler()).build();
            String pass = (String) encryptingHttpClient.post();
            return pass;
        } catch (NotAmethod e) {
            e.printStackTrace();
        }

        return null;
    }
}
