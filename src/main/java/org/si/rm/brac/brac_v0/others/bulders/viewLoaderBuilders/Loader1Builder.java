package org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders;


import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FxmlLoaderService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.Loader1;


public class Loader1Builder implements FxmlLoaderBuilder {
    private FxmlLoaderService loaderService = null;

    public Loader1Builder() {
        this.loaderService = new Loader1();
    }

    @Override
    public Object build() {
        return null;
    }

    @Override
    public FxmlLoaderBuilder  setCSS(String path) {
        return this;
    }

    @Override
    public FxmlLoaderBuilder setResource(String resource) {
        return this;
    }
}
