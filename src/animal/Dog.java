/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Thomas
 */
public class Dog extends Animal {
    
    private boolean isServiceAnimal;

    public Dog() {
    }

    public Dog(boolean isServiceAnimal, String name, String breed) {
        super(name, breed);
        this.isServiceAnimal = isServiceAnimal;
    }

    public boolean isIsServiceAnimal() {
        return isServiceAnimal;
    }

    public void setIsServiceAnimal(boolean isServiceAnimal) {
        this.isServiceAnimal = isServiceAnimal;
    }
    
       @Override
    public String toString() {
        return String.format(super.toString() + "Is Service-animal: %b ", isIsServiceAnimal());
    }
    
    
    

 

   
    
}
