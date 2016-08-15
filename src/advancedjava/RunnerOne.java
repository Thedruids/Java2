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
public class RunnerOne extends Athlete {

    private String _shoeBrand;

    public RunnerOne() {
        //Basic Constructor 
    }

    public RunnerOne(int racerId, String name, int age, String shoeBrand) {
        super(racerId, name, age);
        _shoeBrand = shoeBrand;
        //Complex Coinstructor
    }

    public String getShoeBrand() {
        return _shoeBrand;
    }

    public void setShoeBrand(String _shoeBrand) {
        this._shoeBrand = _shoeBrand;
    }

    @Override
    public String performRaceActivity() {
        return "Running.....";
    }

    @Override
    public String toString() {
        return String.format("%s \tFavourite Brand: %s \tActivity: %s \n",
                super.toString(),
                getShoeBrand(),
                performRaceActivity());
    }

}
