package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

public class EncryptingResponseParser implements JsonEncryptingResponseParser{
    @Override
    public String getPassword(String response) {
        final JSONObject obj = new JSONObject(response);
        String rsa_password = obj.getString("Encrypted Password");
        return rsa_password;
    }
}
