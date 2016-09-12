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
public class SwimmerOne extends Athlete {



    public SwimmerOne() {
    }

    public SwimmerOne(int racerId, String name, int age) {
         super(racerId, name, age);
    }


    @Override
    public String performRaceActivity() {
        return "Swimming......";
    }
    
    
 
    
      @Override
    public String toString() {
        return String.format("%s\tActivity: %s \n", 
                super.toString(),
                performRaceActivity());
    }

}
