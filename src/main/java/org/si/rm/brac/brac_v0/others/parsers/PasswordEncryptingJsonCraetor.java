package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONObject;

import java.util.ArrayList;

public class PasswordEncryptingJsonCraetor implements JsonRequestParser{
    @Override
    public String create(ArrayList<String> values) {
        String password = values.get(0);

        final JSONObject obj = new JSONObject();
        obj.append("password",password);

        return obj.toString();
    }
}
