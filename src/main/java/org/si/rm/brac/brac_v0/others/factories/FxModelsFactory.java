package org.si.rm.brac.brac_v0.others.factories;

import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.modelsBuildersImp.*;


public class FxModelsFactory implements ServiceFactory {
    private Builder modelBuilder = null ;

    public FxModelsFactory() {
        System.out.println("Models Factory Created ...!");
    }

    @Override
    public Builder get(String product) {
        switch (product){
            case "Login":
                modelBuilder = new LoginInformationBuilder();
                break;

            case "Model2":
                break;


            case "Model3":
                break;


            default:
                break;

        }
        return modelBuilder;
    }
}
