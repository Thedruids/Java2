/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

/**
 *
 * @author Thomas
 */
public class Swimmer extends Person {
    
    public Swimmer(){
        
    }

    public Swimmer(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Swimmer(int swimSpeed, String fName, String sName, int age, int id) {
        super(fName, sName, age, id);
        this.swimSpeed = swimSpeed;
    }
    
    private int swimSpeed;

   

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    
       @Override
    public String toString() {
        return String.format("Swimmer{Id number is %d. Name is %s %s. Age is %d and speed is %d kph}",
                super.getId(),
                super.getfName(),
                super.getsName(),
                super.getAge(),
                swimSpeed
        );
}
}
