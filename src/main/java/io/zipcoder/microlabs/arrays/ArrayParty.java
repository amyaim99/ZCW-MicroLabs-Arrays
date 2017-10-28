package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;

public class ArrayParty {

    public String printArray(String[] inputArray) {

        String printedFromArray = "*** Output ***";


        for (int i = 0; i < inputArray.length; i++)

            printedFromArray += "\n" + inputArray[i];

        return printedFromArray;

    }

    public String printLast(String[] inputArray) {

        String printedFromArray = "*** Output ***\n";
        String lastInput = inputArray[inputArray.length - 1].toString();
        printedFromArray += lastInput;

        return printedFromArray;

    }

    public String printLastButOne(String[] inputArray) {

        String printedFromArray = "*** Output ***\n";
        String lastInput = inputArray[inputArray.length - 2].toString();
        ;
        printedFromArray += lastInput;

        return printedFromArray;

    }

    public String resevrseAnArray(String[] inputArray) {

        //String printedFromArray = "*** Output ***";
        int length = inputArray.length;
        String temp = "";
        for (int i = 0; i < length / 2; i++) {

            temp = inputArray[i];
            inputArray[i] = inputArray[length - i - 1];
            inputArray[length - 1 - i] = temp;


        }
        return printArray(inputArray);
    }

    public boolean isPalindromicArray(String[] inputArray) {

        String printedFromArray = "*** Output ***";
        int length = inputArray.length;
        boolean temp = false;
        for (int i = 0; i < length / 2; i++) {

            if (inputArray[i].equals(inputArray[length - i - 1]))
                temp = true;

            else
                temp = false;

        }


        return temp;

    }

    public String compress(int[] inputArray) {

        String printedFromArray = "*** Output ***" + "\n" + inputArray[0];


        for (int i = 1; i < inputArray.length; i++) {

            if (inputArray[i] != inputArray[i - 1]) {
                printedFromArray += "\n" + inputArray[i];
            }

        }
        return printedFromArray;

    }

    public String packDuplicates(char[] inputArray) {

        String packedDuplicates = "*** Output ***\n" +Character.toString(inputArray[0]);
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[i - 1]) {
                packedDuplicates += "," + Character.toString(inputArray[i]);
            } else {
                packedDuplicates += inputArray[i];
            }

        }
        return packedDuplicates;

        //TODO Define the method lastButOne

        //TODO Define the method reverse

        //TODO Define the method isPalindrome

        //TODO Define the method compress

        //TODO Define the method pack


    }
}
