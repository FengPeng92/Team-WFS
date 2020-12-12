/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

/**
 *
 * @author fengpeng
 */
public class Questionary {
    private boolean isAlcoholic;
    private boolean isAllergic;
    private boolean isCold;
    private boolean isSmoking;
    private String testResult;

    public Questionary() {
    }

    public boolean isIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isIsAllergic() {
        return isAllergic;
    }

    public void setIsAllergic(boolean isAllergic) {
        this.isAllergic = isAllergic;
    }

    public boolean isIsCold() {
        return isCold;
    }

    public void setIsCold(boolean isCold) {
        this.isCold = isCold;
    }

    public boolean isIsSmoking() {
        return isSmoking;
    }

    public void setIsSmoking(boolean isSmoking) {
        this.isSmoking = isSmoking;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    
    
    
    
}
