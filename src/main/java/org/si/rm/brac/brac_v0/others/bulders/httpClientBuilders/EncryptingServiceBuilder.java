package org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders;

import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.HttpClientServiceBuilder;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.ConnectionStatusCodeHandler;
import org.si.rm.brac.brac_v0.services.errorHandlerServices.exceptions.NotAmethod;
import org.si.rm.brac.brac_v0.services.httpClientServices.EncryptingHttpClient;
import org.si.rm.brac.brac_v0.services.httpClientServices.HttpClientService;
import org.si.rm.brac.brac_v0.services.httpClientServices.ValidatorHttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

public class EncryptingServiceBuilder implements HttpClientServiceBuilder {
    protected HttpClientService httpClientService = null;
    protected String SCHEMA_URI = "http://localhost:";
    protected String PORT = "5000";

    public EncryptingServiceBuilder() {
        System.out.println("Validator service builder created ..!");
        this.httpClientService = new EncryptingHttpClient();
    }

    @Override
    public HttpClientService build() {
        return httpClientService;
    }

    @Override
    public HttpClientServiceBuilder createConnection() {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        httpClientService.setHttpClient(httpClient);
        return this;
    }

    @Override
    public HttpClientServiceBuilder setRequest(String[] args) throws NotAmethod {
        // 0 ==> URI , 1 ==> Methode , 2 ==> Data;
        HttpRequest request = null;
        String uri = null;
        uri = SCHEMA_URI + PORT + args[0];

        httpClientService.setURI(args[0]);

        switch (args[1]){
            case "GET":

                request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .GET()
                        .build();
                httpClientService.setHttpRequest(request);
                return this;
            case "POST":

                request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(args[2]))
                        .build();
                httpClientService.setHttpRequest(request);



            case "UPDATE":
                request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .PUT(HttpRequest.BodyPublishers.ofString(args[2]))
                        .build();
                httpClientService.setHttpRequest(request);
                return this;

            case "DELETE":
                request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .DELETE()
                        .build();
                httpClientService.setHttpRequest(request);
                return this;

            default:
                throw new NotAmethod("This is Note a Methode");
        }

    }

    @Override
    public HttpClientServiceBuilder setErrorHandler(ConnectionStatusCodeHandler eh) {
        httpClientService.setErrorHandler(eh);
        return this;
    }
}
