package org.si.rm.brac.brac_v0.models.Fxmodels;

public class LoginInformation extends FxModel{
    private String role = "";
    private String password = "";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
