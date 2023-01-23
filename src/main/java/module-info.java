module org.si.rm.brac.brac_v0 {
    requires javafx.controls;
    requires javafx.fxml;

    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires org.json;
    opens org.si.rm.brac.brac_v0 to javafx.fxml;
    exports org.si.rm.brac.brac_v0;
    exports org.si.rm.brac.brac_v0.controllers;
    opens org.si.rm.brac.brac_v0.controllers to javafx.fxml;
}