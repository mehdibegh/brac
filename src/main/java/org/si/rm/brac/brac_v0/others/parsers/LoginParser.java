package org.si.rm.brac.brac_v0.others.parsers;

import org.json.JSONArray;
import org.json.JSONObject;
import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;
import org.si.rm.brac.brac_v0.models.Fxmodels.LoginInformation;

import java.util.ArrayList;

public class LoginParser implements JsonResponseParser{
    @Override
    public ArrayList<FxModel> get(String JsonData) {
        final JSONObject obj = new JSONObject(JsonData);
        String message = obj.getString("message");

        if(message.equals("data not found")) return null;

        final JSONArray data = obj.getJSONArray("data");
        System.out.println(data);
        LoginInformation loginInformation = new LoginInformation();
        loginInformation.setRole(data.getJSONObject(0).getString("LIBELLE_ROLE"));
        loginInformation.setPassword(data.getJSONObject(0).getString("MOT_DE_PASS"));

        ArrayList<FxModel> list = new ArrayList<>();
        list.add(loginInformation);

        return list;
    }
}
