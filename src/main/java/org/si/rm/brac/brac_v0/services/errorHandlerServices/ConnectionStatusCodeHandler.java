package org.si.rm.brac.brac_v0.services.errorHandlerServices;

import java.net.http.HttpResponse;

public class ConnectionStatusCodeHandler {
    public boolean checkRespond(HttpResponse<String> httpResponse) {
        if (httpResponse.statusCode() == 200) {
            System.out.println("Successful Request ...!");
            return true;
        }
        return false;
    }
}
