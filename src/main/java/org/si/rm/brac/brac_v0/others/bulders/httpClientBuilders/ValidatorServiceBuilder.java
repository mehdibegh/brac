package org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders;

import org.si.rm.brac.brac_v0.others.bulders.HttpClientServiceBuilder;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.httpClientServices.HttpClientService;
import org.si.rm.brac.brac_v0.services.httpClientServices.ValidatorHttpClient;

public class ValidatorServiceBuilder implements HttpClientServiceBuilder {
    protected HttpClientService httpClientService = null;

    public ValidatorServiceBuilder() {
        this.httpClientService = new ValidatorHttpClient();
    }

    @Override
    public HttpClientService build() {
        return this.httpClientService;
    }

    @Override
    public HttpClientServiceBuilder createConnection() {
        //Todo : Create HttpClient Object initialize every thing;
        return this;
    }

    @Override
    public HttpClientServiceBuilder setRequest(String[] args) {
        //Todo : Creat HttpRequest and initialize every thing;
        return this;
    }

    @Override
    public HttpClientServiceBuilder setErrorHandler(ConnectionStatusCodeHandler eh) {
        httpClientService.setErrorHandler(eh);
        return null;
    }
}
