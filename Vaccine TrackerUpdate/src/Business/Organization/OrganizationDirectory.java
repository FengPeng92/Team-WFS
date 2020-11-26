/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
//    InstitutionAdmin("Institution Admin Organization"), Doctor("Doctor Organization"),
//        Tester("Tester Organization"), Person("Person Organization"),
//        Scientist("Scientist Organization"), WHOOfficer("WHO Officer Organization"), 
//        HospitalAdmin("HospitalAdmin Organization"), VolunteerManager("Volunteer Manager Organization"), 
//        SystemAdmin("System Admin Organization");
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.InstitutionAdmin.getValue())){
            organization = new InstitutionAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Tester.getValue())) {
            organization = new TesterOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Person.getValue())) {
            organization = new PersonOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Scientist.getValue())) {
            organization = new ScientistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.WHOOfficer.getValue())) {
            organization = new WHOOfficerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HospitalAdmin.getValue())) {
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.VolunteerManager.getValue())) {
            organization = new VolunteerManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SystemAdmin.getValue())) {
            organization = new SystemAdminOrganization();
            organizationList.add(organization);
        } 
        
        return organization;
    }
}