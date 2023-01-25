package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

public class EncryptingResponseParser implements JsonEncryptingResponseParser{
    @Override
    public String getPassword(String response) {
        final JSONObject obj = new JSONObject(response);
        JSONArray list = obj.getJSONArray("Encrypted Password");
        String rsa_password = list.getString(0);
        return rsa_password;


    }
}
