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
    private int effectiveRate;
    private String description;
    private int total;
    private int number;

    public Animal(String animalName, int total, int number, int effectiveRate, String description) {
        this.animalName = animalName;
        this.effectiveRate = effectiveRate;
        this.description = description;
        this.total = total;
        this.number = number;
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

    public void setEffectiveRate(int effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
