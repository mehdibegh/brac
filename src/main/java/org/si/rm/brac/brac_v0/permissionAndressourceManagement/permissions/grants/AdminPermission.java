package org.si.rm.brac.brac_v0.permissionAndressourceManagement.permissions.grants;

import org.si.rm.brac.brac_v0.permissionAndressourceManagement.permissions.PermissionsType;

import java.util.ArrayList;

public class AdminPermission extends BasePermission{
    public AdminPermission() {
        this.permissions = new ArrayList<>();
        permissions.add(PermissionsType.HANDLE_EXPLOITATION_CONTENT);
        permissions.add(PermissionsType.HANDLE_FORMULATION_CONTENT);
        permissions.add(PermissionsType.VIEW_EXPLOITATION_CONTENT);
        permissions.add(PermissionsType.VIEW_FORMULATION_CONTENT);
    }
}
