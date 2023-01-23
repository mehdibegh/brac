package org.si.rm.brac.brac_v0.others.factories;

import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.HttpClientServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.*;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database.AuthentificationServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database.ExploitationServiceBuilder;
import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database.FormulationServiceBuilder;

public class FxHttpClientFactory implements ServiceFactory {
    private HttpClientServiceBuilder httpClientServiceBuilder = null;

    public FxHttpClientFactory() {
       System.out.println("HttpClient Factory Created ...!");
    }

    @Override
    public Builder get(String product) {
        switch (product)
        {
            case "Authentification":
                httpClientServiceBuilder = new AuthentificationServiceBuilder("8087");
                break;

            case "Exploitation":
                httpClientServiceBuilder = new ExploitationServiceBuilder("8089");
                break;
            case "Formulation":
                httpClientServiceBuilder = new FormulationServiceBuilder("8088");
                break;
            case "Validator":
                httpClientServiceBuilder = new ValidatorServiceBuilder();
                break;
            default:
                break;
        }
        return httpClientServiceBuilder;
    }
}
