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
public class Cat extends Animal{
    
    private boolean isDeclawedl;

    public Cat() {
    }
    
    public Cat(boolean isDeclawedl, String name, String breed) {
        super(name, breed);
        this.isDeclawedl = isDeclawedl;
    }

    public boolean isIsDeclawedl() {
        return isDeclawedl;
    }

    public void setIsDeclawedl(boolean isDeclawedl) {
        this.isDeclawedl = isDeclawedl;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Is Declawed: %b ", isIsDeclawedl());
    }
    
    
    
    
    
}
