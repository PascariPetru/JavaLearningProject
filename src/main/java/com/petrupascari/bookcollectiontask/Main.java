package com.petrupascari.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1,2,3,4,7,2,8,9,5,0,4,8,4,6,7,};

        System.out.println(IntArrayManager.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheAverageOfTheElements(tablouDeDateInt));


    }
}
