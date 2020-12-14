/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Entity.User;
import Business.Entity.Vaccine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<WorkRequest> getVaccineShootRequestList() {
        List<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof VaccineShootRequest) {
                requests.add(workRequest);
            }
        }
        return requests;
    }
    
    public List<WorkRequest> getVolunteerApplicationRequestList() {
        List<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof VolunteerApplicationRequest) {
                requests.add(workRequest);
            }
        }
        return requests;
    }
    
    public WorkRequest searchRequestByUser(User user) {
        List<WorkRequest> requests = getVolunteerApplicationRequestList();
        for (WorkRequest request : requests) {
            if (((VolunteerApplicationRequest)request).getUser() == user) {
                return request;
            }
        }  
        return null;
    }
    
    public List<WorkRequest> getReportToWHORequestList() {
        List<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof ReportToWHORequest) {
                requests.add(workRequest);
            }
        }
        return requests;
    }

    public WorkRequest searchRequstByVaccine(Vaccine selectedVaccine) {
        List<WorkRequest> requests = getReportToWHORequestList();
        for (WorkRequest request : requests) {
            if (((ReportToWHORequest)request).getVaccine() == selectedVaccine) {
                return request;
            }
        }  
        return null;
    }
    
    public List<WorkRequest> getAllScientistRequestTesterList() {
        List<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof ScientistRequestTesterRequest) {
                requests.add(workRequest);
            }
        }
        return requests;
    }

    public List<WorkRequest> getScientistRequestTesterByEnterprise(Enterprise enterprise) {   
        List<WorkRequest> requests = new ArrayList<>();
        
        for (WorkRequest request : getAllScientistRequestTesterList()) {
            if (((ScientistRequestTesterRequest)request).getEnterprise() == enterprise) {
                requests.add(request);
            }
        }
        return requests;
    } 

    public ReportToWHORequest searchReportedVaccine(Vaccine selectedVaccine) {
        List<WorkRequest> requests = getReportToWHORequestList();
        for (WorkRequest request : requests) {
            if (((ReportToWHORequest)request).getVaccine() == selectedVaccine) {
                return (ReportToWHORequest)request;
            }
        }
        return null;
    }
}