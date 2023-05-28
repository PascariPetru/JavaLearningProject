package com.petrupascari.zooclubservice;

public abstract class Animal implements AnimalInterface {

    private String name;

    protected Animal(String name) {
        this.name = name;
        System.out.println("Prima linie de cod");
    }

    public abstract void eat();

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;

    }
}
