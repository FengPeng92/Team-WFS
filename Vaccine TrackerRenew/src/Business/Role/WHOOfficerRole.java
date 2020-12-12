/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DoctorWorkArea.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.WHOOfficerWorkArea.WHOOfficerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class WHOOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new WHOOfficerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
    }
    
    
}
