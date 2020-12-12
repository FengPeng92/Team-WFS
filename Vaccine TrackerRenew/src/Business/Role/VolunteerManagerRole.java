/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VolunteerManagerWorkArea.VolunteerManagerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class VolunteerManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new VolunteerManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
    }
    
    
}
