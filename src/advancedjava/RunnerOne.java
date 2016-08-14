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
public class RunnerOne implements RaceParticipant{
    
    private int racerId;
    
    public RunnerOne(){
       //Basic Constructor 
    }

    public RunnerOne(int racerId) {
        this.racerId = racerId;
        //Complex Coinstructor
    }
    
    @Override
    public void setRacerID(int racerId) {
     this.racerId= racerId;
    }

    @Override
    public int getRacerId() {
        return racerId;
    }

    @Override
    public String performRaceActivity() {
        return "Running.....";
    }

    @Override
    public String toString() {
        return String.format("[%s]\tRacerID: %d\tActivity: %s \n", getClass(),getRacerId(), performRaceActivity());
    }
    
    
    
}
