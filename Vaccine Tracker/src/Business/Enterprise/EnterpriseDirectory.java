/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Entity.Vaccine;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.Institution) {
            enterprise=new InstitutionEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.People) {
            enterprise=new PeopleEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.WHO) {
            enterprise=new WHOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public Enterprise searchEnterpiseByName(String enterpriseName) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equals(enterpriseName)) {
                return enterprise;
            }
        }
        return null;
    }

    public Enterprise searchEnterpiseByVaccine(Vaccine selectedVaccine) {
        for (Enterprise enterprise : enterpriseList) {
            for (Vaccine vaccine : enterprise.getVaccineDirectory().getVaccineList()) {
                if (vaccine.getVaccineName().equals(selectedVaccine.getVaccineName())) {
                    return enterprise;
                }
            }
        }
        return null;             
    }
    
    public boolean checkEnterpriseIsUnique(String name) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
}
