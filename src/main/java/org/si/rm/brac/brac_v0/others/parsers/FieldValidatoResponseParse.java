package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONObject;
import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;

import java.util.ArrayList;

public class FieldValidatoResponseParse implements JsonValidatorResponseParser {

    @Override
    public Boolean get(String jsonData) {
        final JSONObject obj = new JSONObject(jsonData);
        String message = obj.getString("message");

        if(message.equals("True"))
        {
            return true;
        }
        if(message.equals("False"))
        {
            return false;
        }
        return true;
    }
}
