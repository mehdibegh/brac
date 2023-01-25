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

public class EncryptingHandler {
    public String Encrypt(String password)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(password);

        JsonRequestParser parser = new PasswordEncryptingJsonCraetor();
        String data = parser.create(list);

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
