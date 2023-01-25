package org.si.rm.brac.brac_v0.services.httpClientServices;

import org.si.rm.brac.brac_v0.others.bulders.ModelBuilder;

import java.io.IOException;
import java.net.http.HttpResponse;

public class DataBaseHttpClient extends HttpClientService {

    public DataBaseHttpClient() {
        System.out.println("Data base Rest client created ..!");
    }

    @Override
    public Object get() {
        try {
            System.out.println("Request: "+httpRequest);
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response: "+httpResponse);
            if (connectionStatusCodeHandler.checkRespond(httpResponse)) {
                ModelBuilder builder = (ModelBuilder) fxModelsFactory.get(getProduct());
                System.out.println("Response From Data Base  : ");
                System.out.println(httpResponse.body());
                return builder.setResponse(httpResponse.body()).build();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object post() {
        return null;
    }


    @Override
    public void update() {
        try {
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try {
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
