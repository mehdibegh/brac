package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONObject;

public class FieldValidationResponseParse implements JsonValidatorResponseParser {

    @Override
    public Boolean get(String jsonData) {
        final JSONObject obj = new JSONObject(jsonData);
        String message = obj.getString("message");

        if(message.equals("True"))
        {
            System.out.println("True parsing");
            return true;
        }
        if(message.equals("False"))
        {
            System.out.println("False parsing");
            return false;
        }
        return true;
    }
}
