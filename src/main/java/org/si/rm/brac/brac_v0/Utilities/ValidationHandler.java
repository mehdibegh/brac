package org.si.rm.brac.brac_v0.Utilities;

import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.ValidatorServiceBuilder;
import org.si.rm.brac.brac_v0.others.factories.FxHttpClientFactory;
import org.si.rm.brac.brac_v0.others.parsers.FieldValidatorJsonCreator;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.ValidatorHttpClient;

import java.util.ArrayList;

public class ValidationHandler {
    private ArrayList<String> fields = null;

    public ValidationHandler() {
        this.fields = new ArrayList<>();
    }

    public ValidationHandler add(String field){
        fields.add(field);
        return this;
    }

    public ArrayList<Integer> validateFields()
    {
        ArrayList<Integer> list = new ArrayList<>();
        FieldValidatorJsonCreator fieldValidatorJsonCreator = new FieldValidatorJsonCreator();

        String data = fieldValidatorJsonCreator.create(fields);

        String[] request = {"/EmptyField","POST",data};

        try {
            ((ValidatorHttpClient)((ValidatorServiceBuilder)Lookup.getInstance().getService(FxHttpClientFactory.class).get("Validator"))
                    .createConnection()
                    .setRequest(request)
                    .setErrorHandler(new ConnectionStatusCodeHandler())
                    .build()).get();
        } catch (NotAmethod e) {
            e.printStackTrace();
        }
    }
}
