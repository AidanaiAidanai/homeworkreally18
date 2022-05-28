package com.company;

import java.util.Arrays;

public class Flat implements Payable{
    private String address;
    private Person[]family;

    public Flat(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("if you want to live in the flat, you would pay service");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "address='" + address + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
