package org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuilders;

import javafx.scene.Parent;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FxmlLoaderService;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FormulationHomeLoader;

public class FormulationHomeLoaderBuilder implements FxmlLoaderBuilder {
    protected FxmlLoaderService fxmlLoaderService = null ;
    @Override
    public Object build() {
        return fxmlLoaderService;
    }

    public FormulationHomeLoaderBuilder() {
        this.fxmlLoaderService = new FormulationHomeLoader();
    }

    @Override
    public FxmlLoaderBuilder setCSS(String path) {
        ((FormulationHomeLoader)fxmlLoaderService).setCSSresource(path);
        return this;
    }

    @Override
    public FxmlLoaderBuilder setResource(String resource) {
        ((FormulationHomeLoader)fxmlLoaderService).setFXMLresource(resource);
        return this;
    }

    @Override
    public FxmlLoaderBuilder setParent(Parent parent) {
        ((FormulationHomeLoader)fxmlLoaderService).setParent(parent);
        return this;
    }
}
