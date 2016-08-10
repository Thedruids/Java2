/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thomas
 */
public class RunnerTest {

    Runner r;
    String name = "Thomas";
    String sName = "Doyle";
    int age = 29;
    int id = 12345;
    int speed = 10;

    public RunnerTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        r = new Runner();
    }

    @After
    public void tearDown() {
        r = null;
    }

    @Test
    public void testConstructors() {
        assertNotNull("could not create new constructor", r);
        Runner r2 = new Runner(10, name, sName, age, id);
        assertNotNull("could not create new complex constructor", r2);
        assertEquals("speed variable not same as expected",
                    speed,
                    r2.getRunSpeed());

    }

    /**
     * Test of running method, of class Runner.
     */
    @Test
    public void testRunning() {
        System.out.println("running");
        Runner instance = new Runner(10);
        String expResult = "Person is running at " + speed + " kph.";
        String result = instance.running();
        assertEquals("running did not return the expected result. ",expResult, result);
        
    }

    /**
     * Test of toString method, of class Runner.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Runner instance = new Runner(speed, name, sName, age, id);
        String expResult = String.format("Runner{Id number is %d. Name is %s %s. Age is %d and speed is %d kph}",
                12345,
                "Thomas",
                "Doyle",
                29,
                10
        );
        String result = instance.toString();
        assertEquals("toString did not run as expected", expResult, result);
       
    }

    /**
     * Test of getRunSpeed method, of class Runner.
     */
    @Test
    public void testGetRunSpeed() {
        System.out.println("getRunSpeed");
        Runner instance = new Runner(speed);
        int expResult = 10;
        int result = instance.getRunSpeed();
        assertEquals("run speed was not as expected. ", expResult, result);
    }

    /**
     * Test of setRunSpeed method, of class Runner.
     */
    @Test
    public void testSetRunSpeed() {
        System.out.println("setRunSpeed");
        int runSpeed = 20;
        Runner instance = new Runner();
        instance.setRunSpeed(runSpeed);
        assertEquals("runspeed was not set as expected. ", instance.getRunSpeed(), runSpeed);
       
    }

}
