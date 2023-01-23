package org.si.rm.brac.brac_v0.others.bulders;

import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;

public interface HttpClientServiceBuilder extends Builder {

    HttpClientServiceBuilder createConnection();
    HttpClientServiceBuilder setRequest(String[] args) throws NotAmethod;
    HttpClientServiceBuilder setErrorHandler(ConnectionStatusCodeHandler eh);
}
