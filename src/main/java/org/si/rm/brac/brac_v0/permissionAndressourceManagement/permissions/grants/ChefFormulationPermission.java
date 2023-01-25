package org.si.rm.brac.brac_v0.permissionAndressourceManagement.permissions.grants;

import org.si.rm.brac.brac_v0.permissionAndressourceManagement.permissions.PermissionsType;

import java.util.ArrayList;

public class ChefFormulationPermission extends BasePermission{
    public ChefFormulationPermission() {
        this.permissions = new ArrayList<>();
        permissions.add(PermissionsType.VIEW_FORMULATION_CONTENT);
    }
}
