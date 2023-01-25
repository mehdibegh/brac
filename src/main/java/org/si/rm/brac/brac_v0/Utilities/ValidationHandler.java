package org.si.rm.brac.brac_v0.Utilities;

import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuildersImp.ValidatorServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.others.parsers.FieldValidatorJsonCreator;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.ValidatorHttpClient;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidationHandler {
    private HashMap<String,String>  fields = null;

    public ValidationHandler() {
        this.fields = new HashMap<>();
    }

    public ValidationHandler add(String key , String value){
        fields.put(key,value);
        return this;
    }

    public boolean validateFields()
    {
        FieldValidatorJsonCreator fieldValidatorJsonCreator = new FieldValidatorJsonCreator();

        String data = fieldValidatorJsonCreator.create(fields);

        String[] request = {"/EmptyField","POST",data};

        try {
            return (Boolean) ((ValidatorHttpClient)((ValidatorServiceBuilder)Lookup.getInstance().getService(FxHttpClientFactory.class).get("Validation"))
                    .createConnection()
                    .setRequest(request)
                    .setErrorHandler(new ConnectionStatusCodeHandler())
                    .build()).post();
        } catch (NotAmethod e) {
            e.printStackTrace();
        }
        return false;
    }
}
