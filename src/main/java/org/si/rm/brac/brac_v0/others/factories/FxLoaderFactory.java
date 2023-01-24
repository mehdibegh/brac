package org.si.rm.brac.brac_v0.others.factories;

import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuildersImp.*;

public class FxLoaderFactory implements ServiceFactory {
    private Builder loaderBuilder = null;

    public FxLoaderFactory() {
        System.out.println("FXML View loader Factory Created ...!");
    }

    @Override
    public Builder get(String product) {
        switch (product){
            case "ADMINISTRATEUR":
                loaderBuilder = new AdminHomeLoaderBuilder();
                break;

            case "AGENT_DE_FORMULATION":

            case "CHEF_DE_FORMULATION":
                loaderBuilder = new FormulationHomeLoaderBuilder();
                break;

            case "AGENT_D_EXPLOITATION":

            case "CHEF_D_EXPLOITATION":
                loaderBuilder = new ExploitationHomeLoaderBuilder();
                break;

            default:
                break;
        }
        return loaderBuilder;
    }
}
