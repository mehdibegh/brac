package org.si.rm.brac.brac_v0.others.bulders;

import javafx.scene.control.Alert;

public class AlertServiceBuilder implements Builder{
    protected Alert alert = null;

    public AlertServiceBuilder() {
        System.out.println("Alert service builder created ..!");
    }

    public AlertServiceBuilder createAlert(Alert.AlertType type)
    {
        alert = new Alert(type);
        return this ;
    }

    public AlertServiceBuilder setTitle(String title)
    {
        alert.setTitle(title);
        return this;
    }

    public AlertServiceBuilder setMessage(String message)
    {
        alert.setContentText(message);
        return this;
    }

    public AlertServiceBuilder setSize(double w, double h)
    {
        alert.setWidth(w);
        alert.setHeight(h);
        return this;
    }

    public AlertServiceBuilder setHeaderText(String text)
    {
        alert.setHeaderText(text);
        return this;
    }
    @Override
    public Object build() {
       return alert ;
    }
}
