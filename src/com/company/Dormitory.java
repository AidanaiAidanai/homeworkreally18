package com.company;

import java.util.Arrays;

public class Dormitory  implements Payable{
    private String address;
    private Person[]family;

    public Dormitory(String address, Person[] family) {
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
        System.out.println("dormitory^s rent is cheaper then the hotel");
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "address='" + address + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
