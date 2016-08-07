/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import utilitiesproject.Utilities;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class ObjectCreation {
    
    private static int counter = 1;
    
    public static int createEntry() {
        System.out.println("Please select from the following options");
        System.out.println("1: Create a new Person Object");
        System.out.println("2: Create a new Runner Object");
        System.out.println("3: Create a new Swimmer Object");
        System.out.println("4: Close");
        int number = Utilities.readInt();
        return number;
    }

    public static void createObject(int number) {
        boolean condition = false;
        boolean condition2 = false;
        int numberOfRunners = 0;
        final int RUN_OBJECT_LENGTH = 2;
        Person p = new Person();
        Runner[] r = new Runner[RUN_OBJECT_LENGTH];
        ArrayList<Swimmer> al = new ArrayList<>();

        while (condition == false) {

            if (condition2 == true) {
                number = createEntry();
            }

            switch (number) {
                case 1:
                    p = ObjectCreation.createPerson(counter);
                    condition2 = true;
                    counter++;
                    break;

                case 2:

                    if (numberOfRunners < RUN_OBJECT_LENGTH) {
                        r[numberOfRunners] = ObjectCreation.createRunner(counter);
                        condition2 = true;
                        numberOfRunners++;
                        counter++;
                        break;

                    } else {
                        System.out.println("You cannot create any more runner objects");
                        break;
                    }

                case 3:
                    al.add(ObjectCreation.createSwimmer(counter));
                    condition2 = true;
                    break;

                case 4:
                    condition = true;
                    break;
            }
        }

        System.out.println("********************Summary of Obects created********************");
        System.out.println("Person Objects:");
        System.out.println(p);
        System.out.println("Runner Objects:");
        for (int i = 0; i < RUN_OBJECT_LENGTH; i++) {
            System.out.println(r[i]);
        }
        System.out.println("Swimmer Objects:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).toString());
        }

    }

    
        public static Person createPerson(int counter) {
        Scanner scan = new Scanner(System.in);

        Person p = new Person();

        System.out.println("Please insert first name");
        p.setfName(scan.nextLine());
        System.out.println("Please insert surname");
        p.setsName(scan.nextLine());
        System.out.println("Please insert age");
        p.setAge(Integer.parseInt(scan.nextLine()));
        p.setId(counter);
        System.out.println("A new Person object has been created: " + p.toString());
        return p;

    }

    public static Runner createRunner(int counter) {
        Scanner scan = new Scanner(System.in);
        Runner r = new Runner();
        System.out.println("Please insert first name");
        r.setfName(scan.nextLine());
        System.out.println("Please insert surname");
        r.setsName(scan.nextLine());
        System.out.println("Please insert age");
        r.setAge(Integer.parseInt(scan.nextLine()));
        r.setId(counter);
        System.out.println("Please insert running speed in KPH");
        r.setRunSpeed(Utilities.readInt());
        System.out.println("A new Runner object has been created: " + r.toString());
        return r;
    }

    public static Swimmer createSwimmer(int counter) {
        Scanner scan = new Scanner(System.in);
        Swimmer s = new Swimmer();
        System.out.println("Please insert first name");
        s.setfName(scan.nextLine());
        System.out.println("Please insert surname");
        s.setsName(scan.nextLine());
        System.out.println("Please insert age");
        s.setAge(Integer.parseInt(scan.nextLine()));
        s.setId(counter);
        counter++;
        System.out.println("Please insert swimming speed in KPH");
        s.setSwimSpeed(Utilities.readInt());
        System.out.println("A new Swimmer object has been created: " + s.toString());
        return s;
    }
    
}
