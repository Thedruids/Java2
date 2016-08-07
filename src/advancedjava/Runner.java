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
public class Runner extends Person {

    private int runSpeed;
    
    public Runner(){
        
    }

    public Runner(int speed) {
        this.runSpeed = speed;
    }

    public Runner(int speed, String fName, String sName, int age, int id) {
        super(fName, sName, age, id);
        this.runSpeed = speed;
    }
    
    

    public String running() {
        return "Person is running at " + runSpeed + " kph.";

    }

    @Override
    public String toString() {
        return String.format("Runner{Id number is %d. Name is %s %s. Age is %d and speed is %d kph}",
                super.getId(),
                super.getfName(),
                super.getsName(),
                super.getAge(),
                runSpeed
        );
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

}
