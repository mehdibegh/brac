package org.si.rm.brac.brac_v0.services.httpClientServices;

import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;
import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.ModelBuilder;

import java.io.IOException;
import java.net.http.HttpResponse;

public class DataBaseHttpClient extends HttpClientService{

    public DataBaseHttpClient() {
        System.out.println("Data base Rest client created ..!");
    }

    @Override
    public Object get() {
        try {
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());

            if(errorHandler.checkRespond(httpResponse))
            {
                ModelBuilder builder = (ModelBuilder) fxModelsFactory.get(getProduct());
                System.out.println("Response From Authentification server : ");
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
        try {
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
