package com.petrupascari.operationsandcyclicfunctions;

public class PrintEvenNumbersOnly {
    public static void main(String[] args) {

        int i = 1;
        int limit = 800;


        for (i = 1; i <= limit; i++) {
            if (i % 2 == 0)
                System.out.println("Numerele pare sunt: " + i);
        }
    }
}




