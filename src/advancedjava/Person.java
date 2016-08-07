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
public class Person {

    private String fName;
    private String sName;
    private int age;
    private int id;

    public Person() {
    }

    public Person(String fName, String sName, int age, int id) {
        this.fName = fName;
        this.sName = sName;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person{Id number is %d. Name is %s %s. Age is %d.}",
                getId(),
                getfName(),
                getsName(),
                getAge());
    }
}
