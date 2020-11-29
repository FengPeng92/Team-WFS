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
import userinterface.ScientistWorkArea.ScientistWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ScientistRole extends Role{
    
    //public ArrayList<Enterprise> 

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ScientistWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
    }
    
    
}
