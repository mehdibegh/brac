package org.si.rm.brac.brac_v0.services.errorHandlerServices;

import java.net.http.HttpResponse;

public class ValidatorRespondHandler implements ErrorHandler{
   @Override
    public boolean checkRespond(HttpResponse<String> httpResponse) {
        return false;
    }
}
