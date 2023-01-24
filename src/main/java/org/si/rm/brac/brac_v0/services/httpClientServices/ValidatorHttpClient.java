package org.si.rm.brac.brac_v0.services.httpClientServices;

import org.si.rm.brac.brac_v0.others.bulders.ModelBuilder;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ValidatorHttpClient extends HttpClientService{
    @Override
    public Object get() {
        try {
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());

            if(connectionStatusCodeHandler.checkRespond(httpResponse))
            {
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
    public void post() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
