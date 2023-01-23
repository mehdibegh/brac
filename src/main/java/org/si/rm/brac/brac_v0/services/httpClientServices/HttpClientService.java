package org.si.rm.brac.brac_v0.services.httpClientServices;

import org.si.rm.brac.brac_v0.Lookup;
import org.si.rm.brac.brac_v0.others.factories.FxModelsFactory;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import java.net.http.*;
import java.util.StringTokenizer;

public abstract class HttpClientService extends Object{
    protected String URI = "";
    protected HttpRequest httpRequest = null;
    protected HttpResponse<String> httpResponse = null;
    protected HttpClient httpClient = null;
    private boolean Sync = true ; //Todo :
    protected FxModelsFactory fxModelsFactory= null ;
    protected ConnectionStatusCodeHandler connectionStatusCodeHandler = null;

    public HttpClientService() {
        this.fxModelsFactory = Lookup.getInstance().getService(FxModelsFactory.class);
    }



    public abstract Object get();

    public abstract void post();

    public abstract void update();

    public abstract void delete();

    public boolean isSync() {
        return Sync;
    }

    public void setSync(boolean sync) {
        Sync = sync;
    }

    public void setErrorHandler(ConnectionStatusCodeHandler connectionStatusCodeHandler) {
        this.connectionStatusCodeHandler = connectionStatusCodeHandler;
    }


    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    protected String getProduct()
    {
        StringTokenizer stringTokenizer = new StringTokenizer(URI ,"/:");
        return stringTokenizer.nextToken();
    }
}
