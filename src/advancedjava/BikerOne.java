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
public class BikerOne extends Athlete{

   private boolean _usesClips;

    public BikerOne() {
    }
    
     public BikerOne(int racerId, String name, int age, boolean usesClips) {
       super(racerId, name, age);
       _usesClips = usesClips;
    }
     
     public boolean getUsesClips(){
         return _usesClips;
     }
     
     public void setUsesClips(boolean usesClips){
         _usesClips = usesClips;
     }
    
    

  

    @Override
    public String performRaceActivity() {
        return "Cycling......";
    }
    
    
      @Override
    public String toString() {
        return String.format("%s\tUses Clips: %s\tActivity: %s \n", 
                super.toString(),
                _usesClips,
                performRaceActivity());
    }

    
}
