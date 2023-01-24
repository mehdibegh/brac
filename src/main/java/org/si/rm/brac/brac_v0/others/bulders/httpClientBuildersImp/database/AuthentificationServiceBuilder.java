package org.si.rm.brac.brac_v0.others.bulders.httpClientBuildersImp.database;

import org.si.rm.brac.brac_v0.others.bulders.httpClientBuildersImp.DataBaseServiceBuilder;

public class AuthentificationServiceBuilder extends DataBaseServiceBuilder {
    public AuthentificationServiceBuilder(String Port) {
        this.PORT = Port;
        System.out.println("Authentification Service Builder created ..!");
    }
}
