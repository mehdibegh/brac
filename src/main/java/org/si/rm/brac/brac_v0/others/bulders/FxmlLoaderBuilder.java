package org.si.rm.brac.brac_v0.others.bulders;

import javafx.scene.Parent;

public interface FxmlLoaderBuilder extends Builder{
    FxmlLoaderBuilder setCSS();
    FxmlLoaderBuilder setResource();
    FxmlLoaderBuilder setParent(Parent parent);
}
