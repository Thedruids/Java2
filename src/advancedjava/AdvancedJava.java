/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import utilitiesproject.Utilities;

/**
 *
 * @author Thomas
 */
public class AdvancedJava {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Utilities.readInt();
        
        RunnerOne rOne = new RunnerOne(1234, "Thomas", 29);
        SwimmerOne sOne = new SwimmerOne(9876, "Jonathan", 31);
        BikerOne bOne = new BikerOne(4567, "Anthony", 37);
        System.out.println(rOne);
        System.out.println(sOne);
        System.out.println(bOne);

        Runner r1 = new Runner(15, "Thomas", "Doyle", 29, 0001);
        Runner r2 = new Runner(15, "Thomas", "Doyle", 29, 0001);
        Runner r3 = new Runner(12);

        System.out.println(r1.running());

        System.out.println(r1 + " is equal to " + r2 + ": " + Utilities.nullSafeCompare(r1, r2));
        System.out.println(r1 + " is equal to " + r1 + ": " + Utilities.nullSafeCompare(r1, r1));
        System.out.println(r1.toString());
        System.out.println(r1.getfName() + " is equal to " + r3.getfName() + " " + Utilities.nullSafeCompare(r1.getfName(), r3.getfName()));

        String one = "Cheese";
        String two = "Cheese";
        System.out.println(one.compareTo(two));

        ObjectCreation.createObject(ObjectCreation.createEntry());

    }

    
}
