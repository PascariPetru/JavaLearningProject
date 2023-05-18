package com.petrupascari.accessmodifiers;
import com.petrupascari.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {
        Person andreiBuzu = new Person(546345636);
        andreiBuzu.address = "dfewwqw 11";
        andreiBuzu.gender = "Mujic";
        System.out.println(andreiBuzu.toString());
        Person.printNUmberOfPeople();

        Person mihaiEminescu = new Person(432523, "Mihai Eminescu", false, 31);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Male";
        System.out.println("Detaliile despre Mihai Eminescu sunt: " +mihaiEminescu.name + "cu genul: " + mihaiEminescu.gender);
        System.out.println(mihaiEminescu.toString());
        Person.printNUmberOfPeople();

        Person joraBetivul = new Person(1321344, "Jorel Bautul",true, 99);
        joraBetivul.gender = "Masculin";
        joraBetivul.address = "Valea Dealului 5";
        System.out.println(joraBetivul.toString());
        Person.printNUmberOfPeople();

        Person jorelBorel = new Person(13213344, "Joqwer qweqrr",true, 111);
        jorelBorel.gender = "unknown";
        jorelBorel.address = "pe undeva 11";
        System.out.println(jorelBorel.toString());
        Person.printNUmberOfPeople();
    }
}