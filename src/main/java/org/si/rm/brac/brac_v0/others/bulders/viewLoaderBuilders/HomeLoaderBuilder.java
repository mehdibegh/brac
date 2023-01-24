package org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders;

import javafx.scene.Parent;
import org.si.rm.brac.brac_v0.others.bulders.Builder;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FxmlLoaderService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.HomeLoader;

public class HomeLoaderBuilder implements FxmlLoaderBuilder {
    protected FxmlLoaderService fxmlLoaderService = null ;
    @Override
    public Object build() {
        return fxmlLoaderService;
    }

    public HomeLoaderBuilder() {
        this.fxmlLoaderService = new HomeLoader();
    }

    @Override
    public FxmlLoaderBuilder setCSS(String path) {
        ((HomeLoader)fxmlLoaderService).setCSSresource(path);
        return this;
    }

    @Override
    public FxmlLoaderBuilder setResource(String resource) {
        ((HomeLoader)fxmlLoaderService).setFXMLresource(resource);
        return this;
    }

    @Override
    public FxmlLoaderBuilder setParent(Parent parent) {
        ((HomeLoader)fxmlLoaderService).setParent(parent);
        return this;
    }
}
