package org.si.rm.brac.brac_v0.services;

public class ProfileService {
    private String Username = "";
    private String Role = "";
    private String Password = "";

    public ProfileService(String usernam, String role, String password) {
        Username = usernam;
        Role = role;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public String getRole() {
        return Role;
    }

    public String getPassword() {
        return Password;
    }
}
