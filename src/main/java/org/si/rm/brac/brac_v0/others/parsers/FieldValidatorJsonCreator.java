package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class FieldValidatorJsonCreator implements JsonRequestParser{
    @Override
    public String create(ArrayList<String> values) {
        final JSONObject obj = new JSONObject();
        JSONArray dataValues = new JSONArray();
        for(int i =0;i<values.size();i++)
        {
            JSONObject field = new JSONObject();
            field.append("field", values.get(i));

            dataValues.put(i,field);

        }

        obj.append("data",dataValues);
        System.out.println(obj.toString());
        return  obj.toString();
    }
}
