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
public class SwimmerOne implements RaceParticipant, PersonInterface {

    private int racerId;
    private int _age;
    private String _name;

    public SwimmerOne() {
    }

    public SwimmerOne(int racerId, String name, int age) {
         this.racerId = racerId;
         _name = name;
         _age = age;
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
        return "Swimming......";
    }
    
    
     @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public int getAge() {
        return _age;
    }

    @Override
    public void setAge(int age) {
       _age = age;
    }
    
      @Override
    public String toString() {
        return String.format("[%s]\tName: %s\tAge: %d\tRacerID: %d\tActivity: %s \n", 
                getClass(), 
                getName(), 
                getAge(), 
                getRacerId(), 
                performRaceActivity());
    }

}
