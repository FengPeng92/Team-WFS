 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Entity.UserDirectory;
import Business.Entity.VaccineDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private VaccineDirectory vaccineDirectory;
    private UserDirectory userDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Institution("Institution"),
        People("People"),
        WHO("WHO");              
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        if (type == EnterpriseType.Hospital || type == EnterpriseType.Institution) {
            vaccineDirectory = new VaccineDirectory();
            
        } 
        
        if (type == EnterpriseType.People || type == EnterpriseType.Hospital) {
            userDirectory = new UserDirectory();
        }
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

}
