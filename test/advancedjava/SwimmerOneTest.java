/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Thomas
 */
public class SwimmerOneTest {

    public SwimmerOneTest() {

    }

  private SwimmerOne r1;
    private int racerID = 1234;
    private String name = "Thomas";
    private int age = 29;
            
    
 
    
    @Before
    public void setUp() {
        //r1 = new SwimmerOne(10);
    }
    
    @After
    public void tearDown() {
        r1 = null;
    }
    
    @Test
    public void testContructors() {
        SwimmerOne r = new SwimmerOne(1234, "Thomas", 29);
        assertEquals("ID did not set as expected", 
                racerID, 
                r.getRacerId());
        assertEquals("Name did not set as expected", 
                name, 
                r.getName());
        assertEquals("Age did not set as expected", 
                age, 
                r.getAge());
        
        
        SwimmerOne r2 = new SwimmerOne();
        assertNotNull("Constructor could not create", r);
        assertNotNull("Constructor could not create", r2);
        
    }

    /**
     * Test of setRacerID method, of class SwimmerOne.
     */
    @Test
    public void testSetRacerID() {
        System.out.println("setRacerID");
        int racerId = 0;
        SwimmerOne instance = new SwimmerOne();
        instance.setRacerID(racerId);
        assertNotNull("racerId is null ", racerId);
        assertEquals("racerId is not equal ", racerId, 0);
    }

    /**
     * Test of getRacerId method, of class SwimmerOne.
     */
    @Test
    public void testGetRacerId() {
        System.out.println("getRacerId");
        SwimmerOne instance = new SwimmerOne();
        instance.setRacerID(racerID);
        int expResult = 1234;
        int result = instance.getRacerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of performRaceActivity method, of class SwimmerOne.
     */
    @Test
    public void testPerformRaceActivity() {
        System.out.println("performRaceActivity");
        SwimmerOne instance = new SwimmerOne();
        String expResult = "Swimming......";
        String result = instance.performRaceActivity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class SwimmerOne.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SwimmerOne instance = new SwimmerOne();
        instance.setRacerID(10);
        instance.setName("Thomas");
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals("toString did not match", expResult, result);
        
        String rID = String.format("%d", instance.getRacerId());
        assertTrue("String did not contain RacerID: ", result.contains(rID));
        
        String rClass = String.format("%s", instance.getClass());
        assertTrue("String did not contain class: ", result.contains(rClass));
        
        assertTrue("String did not contain name: ", result.contains(instance.getName()));
        
        String rAge = String.format("%s", instance.getAge());
        assertTrue("String did not contain age: ", result.contains(rAge));
        
        assertTrue("String did not contain " + instance.performRaceActivity() + ": ", result.contains(instance.performRaceActivity()));
        
    }

    /**
     * Test of getName method, of class SwimmerOne.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SwimmerOne instance = new SwimmerOne(1234, "Thomas", 29);
        String expResult = "Thomas";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class SwimmerOne.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Thomas";
        SwimmerOne instance = new SwimmerOne();
        instance.setName(name);
        assertTrue("Did not set name as expected: ", name.contains("Thomas"));
    }

    /**
     * Test of getAge method, of class SwimmerOne.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        SwimmerOne instance = new SwimmerOne();
        instance.setAge(29);
        int expResult = 29;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class SwimmerOne.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 29;
        SwimmerOne instance = new SwimmerOne();
        instance.setAge(age);
        assertTrue("Did not set age as expected: ", (age == 29));
    }
    
}
