package org.si.rm.brac.brac_v0.others.bulders;

import javafx.scene.Parent;

public interface FxmlLoaderBuilder extends Builder{
    FxmlLoaderBuilder setCSS(String path);
    FxmlLoaderBuilder setResource(String resource);
    FxmlLoaderBuilder setParent(Parent parent);
}
