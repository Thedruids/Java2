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
public class BikerOne implements RaceParticipant{

    private int racerId;

    public BikerOne() {
    }
    
    

    @Override
    public void setRacerID(int racerId) {
        this.racerId = racerId;
    }

    @Override
    public int getRacerId() {
        return racerId;
    }

    @Override
    public String performRaceActivity() {
        return "Cycling......";
    }
    
}
