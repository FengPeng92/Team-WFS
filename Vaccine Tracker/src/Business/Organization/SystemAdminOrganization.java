/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SystemAdminOrganization extends Organization{

    public SystemAdminOrganization() {
        super(Type.SystemAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdminRole());
        return roles;
    }
     
}
