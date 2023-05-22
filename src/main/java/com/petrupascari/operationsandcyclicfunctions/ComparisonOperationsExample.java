package com.petrupascari.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        //Mai mare decit
        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decit: " + isGreaterThan);

        //Mai mic decit
        boolean isLessThan = a < b;
        System.out.println("Mai mic decit: " + isLessThan);

        //Mai mare sau egal cu
        boolean isGreaterOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu: " + isGreaterOrEqual);

        //Mai mic sau egal cu
        boolean isLessThanorEqual = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThanorEqual);


    }
}
