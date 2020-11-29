/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaysu
 */
public class AnimalDirectory {
    private List<Animal> AnimalList;

    public AnimalDirectory() {
        AnimalList = new ArrayList<>();
    }

    public List<Animal> getAnimalList() {
        if (AnimalList == null) {
            AnimalList = new ArrayList<>();
        }
        return AnimalList;
    }

    public void setAnimalList(List<Animal> AnimalList) {
        this.AnimalList = AnimalList;
    }
    
    

    public Animal searchAnimalByName(String searchAnimal) {
        for (Animal animal : AnimalList) {
            if (animal.getAnimalName() == null ? searchAnimal == null : animal.getAnimalName().equals(searchAnimal)) {
                return animal;
            }
        }       
        return null;
    }
}
