/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InstitutionAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InstitutionAdminOrganization extends Organization{

    public InstitutionAdminOrganization() {
        super(Organization.Type.InstitutionAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InstitutionAdminRole());
        return roles;
    }
     
   
    
    
}
