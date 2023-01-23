package org.si.rm.brac.brac_v0.services.errorHandlerServices;

import javafx.scene.control.Alert;
import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.bulders.AlertServiceBuilder;

import java.net.http.HttpResponse;

public class ConnectionStatusCodeHandler {
    public boolean checkRespond(HttpResponse<String> httpResponse) {
        if (httpResponse.statusCode() == 200) {
            System.out.println("Successful Request ...!");
            return true;
        }
        ((Alert) Lookup.getInstance().getService(AlertServiceBuilder.class).createAlert(Alert.AlertType.INFORMATION)
                .setMessage("عدرا لايمكن الاتصال بخادم قاعدة البيانات ..!")
                .setTitle("اتصالات")
                .build()).show();
        return false;
    }
}
