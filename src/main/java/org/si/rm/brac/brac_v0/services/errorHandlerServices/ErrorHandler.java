package org.si.rm.brac.brac_v0.services.errorHandlerServices;

import java.net.http.HttpResponse;

public interface ErrorHandler {
    boolean checkRespond(HttpResponse<String> httpResponse);
}
