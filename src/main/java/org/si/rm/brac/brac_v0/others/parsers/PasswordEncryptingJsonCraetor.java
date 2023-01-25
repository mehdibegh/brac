package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PasswordEncryptingJsonCraetor implements JsonRequestParser{
    @Override
    public String create(HashMap<String,String> values) {
        int index =0;
        JSONObject field = new JSONObject();
        for(Map.Entry m : values.entrySet())
        {
            field.putOnce((String) m.getKey(),m.getValue());
        }


        return field.toString();
    }
}
