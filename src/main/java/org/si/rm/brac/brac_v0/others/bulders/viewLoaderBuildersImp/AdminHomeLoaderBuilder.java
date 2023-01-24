package org.si.rm.brac.brac_v0.others.bulders.viewLoaderBuildersImp;

import javafx.scene.Parent;
import org.si.rm.brac.brac_v0.others.bulders.FxmlLoaderBuilder;
import org.si.rm.brac.brac_v0.services.ViewLoaderServices.FXMLoaderService;

public class AdminHomeLoaderBuilder implements FxmlLoaderBuilder {
    protected FXMLoaderService fxmlLoaderService = null ;
    @Override
    public Object build() {
        return fxmlLoaderService;
    }

    public AdminHomeLoaderBuilder() {
        this.fxmlLoaderService = new FXMLoaderService();
    }

    @Override
    public FxmlLoaderBuilder setCSS() {
        fxmlLoaderService.setCSS_resource("./styles/adminHome.css");
        return this;
    }

    @Override
    public FxmlLoaderBuilder setResource() {
        fxmlLoaderService.setFXML_resource("AdministrateurHomeView.fxml");
        return this;
    }

    @Override
    public FxmlLoaderBuilder setParent(Parent parent) {
        fxmlLoaderService.setParent(parent);
        return this;
    }
}
