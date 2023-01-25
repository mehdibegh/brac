package org.si.rm.brac.brac_v0.services.httpClientServices;

import org.si.rm.brac.brac_v0.others.parsers.EncryptingResponseParser;
import org.si.rm.brac.brac_v0.others.parsers.JsonEncryptingResponseParser;

import java.io.IOException;
import java.net.http.HttpResponse;

public class EncryptingHttpClient extends HttpClientService{
    @Override
    public Object get() {
        return null;
    }

    @Override
    public Object post() {
        try {
            System.out.println("Request: "+httpRequest);
            httpResponse = httpClient.send(httpRequest , HttpResponse.BodyHandlers.ofString());
            System.out.println("Response: "+httpResponse);
            if(connectionStatusCodeHandler.checkRespond(httpResponse))
            {
                System.out.println("Response From Encrypting server  : ");
                System.out.println(httpResponse.body());

                JsonEncryptingResponseParser parser = new EncryptingResponseParser();
                return parser.getPassword(httpResponse.body());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
