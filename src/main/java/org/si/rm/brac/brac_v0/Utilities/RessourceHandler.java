package org.si.rm.brac.brac_v0.Utilities;

import org.si.rm.brac.brac_v0.permissionAndressourceManagement.permissions.Roles;

public class RessourceHandler {

    public String getRessourceName(String Role)
    {
        switch (Role)
        {
            case "ADMINISTRATEUR":
                return "AdministrateurHomeView.fxml";

            case "CHEF_DE_FORMULATION":

            case "AGENT_DE_FORMULATION":
                return "FormulationHomeView.fxml";

            case "AGENT_D_EXPLOITATION":

            case "CHEF_D_EXPLOITATION":
                return "ExploitationHomeView.fxml";

            default:
                break;
        }

        return null;
    }

    //Todo: CSS files
    public String getCssFile(String Role)
    {
        switch (Role)
    {
        case "ADMINISTRATEUR":
            return "AdministrateurHomeView.fxml";

        case "CHEF_DE_FORMULATION":

        case "AGENT_DE_FORMULATION":
            return "FormulationHomeView.fxml";

        case "AGENT_D_EXPLOITATION":

        case "CHEF_D_EXPLOITATION":
            return "ExploitationHomeView.fxml";

        default:
            break;
    }

        return null;
    }
}
