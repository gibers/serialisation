package org.jbc;

import org.jbc.enums.Sexe;

import java.io.Serializable;

/**
 * Created by Jean-Baptiste on 19/02/2017.
 */
public class Person extends ObjectSerializable{
    private String name;
    private String firstName;
    private int age;
    private Enum<Sexe> sexe;

    public Person() {
    }

    public Person(String name, String firstName, int age, Enum<Sexe> sexe) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.sexe = sexe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum<Sexe> getSexe() {
        return sexe;
    }

    public void setSexe(Enum<Sexe> sexe) {
        this.sexe = sexe;
    }
}
