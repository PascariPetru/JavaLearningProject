package com.petrupascari.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        int stringLength = inputString.length();
        return stringLength;
    }

    public static int getTheTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();

        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message: " + capturedExceptionInTryBlock.getMessage());
            return 0;

        } finally {
            System.out.println("This block is executed no matter what ");
        }

    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("input string is a null value, be careful! ");
            return 0;

        } else {
            return inputString.length();
        }
    }
}


