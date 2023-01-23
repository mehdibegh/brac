package org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.database;

import org.si.rm.brac.brac_v0.others.bulders.httpClientBuilders.DataBaseServiceBuilder;

public class AuthentificationServiceBuilder extends DataBaseServiceBuilder {
    public AuthentificationServiceBuilder(String Port) {
        this.PORT = Port;
        System.out.println("Authentification Service Builder created ..!");
    }
}
