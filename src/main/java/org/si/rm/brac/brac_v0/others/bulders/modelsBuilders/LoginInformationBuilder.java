package org.si.rm.brac.brac_v0.others.bulders.modelsBuilders;

import javafx.scene.control.Alert;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;
import org.si.rm.brac.brac_v0.models.Fxmodels.LoginInformation;
import org.si.rm.brac.brac_v0.others.bulders.AlertServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.ModelBuilder;
import org.si.rm.brac.brac_v0.others.parsers.JsonResponseParser;
import org.si.rm.brac.brac_v0.others.parsers.LoginParser;

import java.net.http.HttpResponse;
import java.util.ArrayList;

public class LoginInformationBuilder implements ModelBuilder {
    protected FxModel loginInfo = null;
    private String RESPONSE = "";
    private JsonResponseParser jsonResponseParser = null;
    public LoginInformationBuilder() {

        this.loginInfo = new LoginInformation();
        this.jsonResponseParser = new LoginParser();
    }


    @Override
    public FxModel build() {
        ArrayList<FxModel> list = jsonResponseParser.get(RESPONSE);
        if(list.size() == 0)
        {
            ((Alert)Lookup.getInstance().getService(AlertServiceBuilder.class).createAlert(Alert.AlertType.INFORMATION)
                    .setMessage("عدرا لايوجد حساب بهدا الاسم ..!")
                    .setTitle("معالجة التسجيل")
                    .build()).show();
            return null ;
        }

        loginInfo = (LoginInformation)list.get(0);

        return loginInfo;
    }

    @Override
    public ModelBuilder setResponse(String response) {
        RESPONSE = response;
        return this;
    }
}
