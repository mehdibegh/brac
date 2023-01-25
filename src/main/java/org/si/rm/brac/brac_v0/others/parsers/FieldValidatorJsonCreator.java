package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldValidatorJsonCreator implements JsonRequestParser{
    @Override
    public String create(HashMap<String,String> values) {
        final JSONObject obj = new JSONObject();
        JSONArray dataValues = new JSONArray();
        int index =0;
        for(Map.Entry m : values.entrySet())
        {
            JSONObject field = new JSONObject();
            field.putOnce((String) m.getKey(),m.getValue());

            dataValues.put(index,field);
            index += 1;

        }

        obj.putOnce("data",dataValues);
        System.out.println(obj.toString());
        return  obj.toString();
    }
}
