module org.si.rm.brac.brac_v0 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;
    opens org.si.rm.brac.brac_v0 to javafx.fxml;
    exports org.si.rm.brac.brac_v0;
    exports org.si.rm.brac.brac_v0.controllers.home.Admin;
    exports org.si.rm.brac.brac_v0.controllers.home.Cexploitation;
    exports org.si.rm.brac.brac_v0.controllers.home.Cformulation;
    exports org.si.rm.brac.brac_v0.controllers.login;
    opens org.si.rm.brac.brac_v0.controllers.login to javafx.fxml;
    opens org.si.rm.brac.brac_v0.controllers.home to javafx.fxml;
    opens org.si.rm.brac.brac_v0.controllers.home.Admin to javafx.fxml;
    opens org.si.rm.brac.brac_v0.controllers.home.Cexploitation to javafx.fxml;
    opens org.si.rm.brac.brac_v0.controllers.home.Cformulation to javafx.fxml;


}