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
public class Animal {
    private String animalName;
    private double effectiveRate;
    private String description;

    public Animal(String animalName, double effectiveRate, String description) {
        this.animalName = animalName;
        this.effectiveRate = effectiveRate;
        this.description = description;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getEffectiveRate() {
        return effectiveRate;
    }

    public void setEffectiveRate(double effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
