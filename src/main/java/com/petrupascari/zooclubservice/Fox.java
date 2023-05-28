package com.petrupascari.zooclubservice;

public class Fox extends Animal {

    public Fox(String name) {
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats Chicken ");


    }

    @Override

    public void makeSound() {
        System.out.println(getName() + " baiatu ai un leu? ");

    }
}
