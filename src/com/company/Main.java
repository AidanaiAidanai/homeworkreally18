package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person[]family1 = {new Person("aidana", 18),new Person("ainura", 25)};
        Person[]family2 = {new Person("nunu",20),new Person("Ermek", 23)};
        Person[]family3 = {new Person("Jupar", 41),new Person("Omurbek", 44)};
        Flat flat = new Flat("bishkek", family1);
        flat.pay();
        System.out.println(flat);
        System.out.println();
        Hotel hotel = new Hotel("Batken",family2);
        hotel.pay();
        System.out.println(hotel);
        System.out.println();
        Dormitory dormitory = new Dormitory("osh",family3);
        dormitory.pay();
        System.out.println(dormitory);

    }
}
