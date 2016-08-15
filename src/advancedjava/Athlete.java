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
public abstract class Athlete implements RaceParticipant, PersonInterface {

    private int racerId;
    private String _name;
    private int _age;

    public Athlete() {
        //Basic Constructor 
    }

    public Athlete(int racerId, String name, int age) {
        this.racerId = racerId;
        _name = name;
        _age = age;
        //Complex Coinstructor
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
    public void setRacerID(int racerId) {
        this.racerId = racerId;
    }

    @Override
    public int getRacerId() {
        return racerId;
    }

    @Override
    public abstract String performRaceActivity();

    @Override
    public String toString() {
        return String.format("[%s]\tName: %s\tAge: %d\tRacerID: %d",
                getClass(),
                getName(),
                getAge(),
                getRacerId());
    }
}
