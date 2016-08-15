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

public class RunnerOneTest {

    public RunnerOneTest() {
    }

    private RunnerOne r1;
    private int racerID = 1234;
    private String name = "Thomas";
    private int age = 29;
    private String shoeBrand = "Nike";

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        //r1 = new RunnerOne(10);
    }

    @After
    public void tearDown() {
        r1 = null;
    }

    @Test
    public void testContructors() {
        RunnerOne r = new RunnerOne(1234, "Thomas", 29, "Nike");
        assertEquals("ID did not set as expected",
                racerID,
                r.getRacerId());
        assertEquals("Name did not set as expected",
                name,
                r.getName());
        assertEquals("Age did not set as expected",
                age,
                r.getAge());
        assertEquals("Brand did not set as expected",
                shoeBrand,
                r.getShoeBrand());

        RunnerOne r2 = new RunnerOne();
        assertNotNull("Constructor could not create", r);
        assertNotNull("Constructor could not create", r2);

    }

    /**
     * Test of setRacerID method, of class RunnerOne.
     */
    @Test
    public void testSetRacerID() {
        System.out.println("setRacerID");
        int racerId = 0;
        RunnerOne instance = new RunnerOne();
        instance.setRacerID(racerId);
        assertNotNull("racerId is null ", racerId);
        assertEquals("racerId is not equal ", racerId, 0);
    }

    /**
     * Test of getRacerId method, of class RunnerOne.
     */
    @Test
    public void testGetRacerId() {
        System.out.println("getRacerId");
        RunnerOne instance = new RunnerOne();
        instance.setRacerID(racerID);
        int expResult = 1234;
        int result = instance.getRacerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of performRaceActivity method, of class RunnerOne.
     */
    @Test
    public void testPerformRaceActivity() {
        System.out.println("performRaceActivity");
        RunnerOne instance = new RunnerOne();
        String expResult = "Running.....";
        String result = instance.performRaceActivity();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class RunnerOne.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RunnerOne instance = new RunnerOne();
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

        String rShoeBrand = String.format("%s", instance.getShoeBrand());
        assertTrue("String did not contain Shoe Brand: ", result.contains(rShoeBrand));

        assertTrue("String did not contain " + instance.performRaceActivity() + ": ", result.contains(instance.performRaceActivity()));

    }

    /**
     * Test of getName method, of class RunnerOne.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RunnerOne instance = new RunnerOne(1234, "Thomas", 29, "Asics");
        String expResult = "Thomas";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class RunnerOne.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Thomas";
        RunnerOne instance = new RunnerOne();
        instance.setName(name);
        assertTrue("Did not set name as expected: ", name.contains("Thomas"));
    }

    /**
     * Test of getAge method, of class RunnerOne.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        RunnerOne instance = new RunnerOne();
        instance.setAge(29);
        int expResult = 29;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAge method, of class RunnerOne.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 29;
        RunnerOne instance = new RunnerOne();
        instance.setAge(age);
        assertTrue("Did not set age as expected: ", (age == 29));
    }

    /**
     * Test of getShoeBrand method, of class RunnerOne.
     */
    @Test
    public void testGetShoeBrand() {
        System.out.println("getShoeBrand");
        RunnerOne instance = new RunnerOne(1234, "Thomas", 29, "Asics");
        String expResult = "Asics";
        String result = instance.getShoeBrand();
        assertEquals("Shoebrand did not get as expected: ", expResult, result);

    }

    /**
     * Test of setShoeBrand method, of class RunnerOne.
     */
    @Test
    public void testSetShoeBrand() {
        System.out.println("setShoeBrand");
        String _shoeBrand = "Nike";
        RunnerOne instance = new RunnerOne();
        instance.setShoeBrand(_shoeBrand);
        assertEquals("Shoebrand did not set as expected", instance.getShoeBrand(), _shoeBrand);
    }

}
