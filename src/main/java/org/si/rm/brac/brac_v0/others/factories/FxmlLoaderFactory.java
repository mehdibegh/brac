package org.si.rm.brac.brac_v0.others.factories;

import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders.*;

public class FxmlLoaderFactory implements ServiceFactory {
    private Builder loaderBuilder = null;

    public FxmlLoaderFactory() {
        System.out.println("FXML Vie loader Factory Created ...!");
    }

    @Override
    public Builder get(String product) {
        switch (product){
            case "Home":
                loaderBuilder = new HomeLoaderBuilder();
                break;

            case "loader2":
                loaderBuilder = new Loader1Builder();
                break;

            case "loader3":
                loaderBuilder = new Loader1Builder();
                break;

            default:
                break;
        }
        return loaderBuilder;
    }
}
