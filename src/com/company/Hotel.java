package com.company;

import java.util.Arrays;

public class Hotel  implements Payable{
    private String address;
    private Person[]family;

    public Hotel(String address, Person[] family) {
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
        System.out.println("you must pay rent");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "address='" + address + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
