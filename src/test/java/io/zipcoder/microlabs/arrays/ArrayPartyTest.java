package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {
    String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
  ArrayParty arrayParty = new ArrayParty();

    @Test
    public void printArrayTest() {
        //: Given


        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {

        //: Given
        String expected = "*** Output ***\nMushrooms";

        //: When
        String actual = arrayParty.printLast(breakfast);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void lastButOneElementTest() {

        //: Given
        String expected = "*** Output ***\nTomatoes";

        //: When
        String actual = arrayParty.printLastButOne(breakfast);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void reverseAnArrayTestTest() {
        //: Given


        String expected = "*** Output ***\n" +


                "Mushrooms\n" + "Tomatoes\n" + "Bacon\n" + "Beans\n" + "Eggs\n" + "Sausage";


        //: When
        String actual = arrayParty.resevrseAnArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }
    @Test
    public void isPalindromeTest() {
        //: Given
        String [] palindromic = {"Sausage", "Eggs", "Beans","Beans", "Eggs", "Sausage"};

        boolean expected = true;


        //: When
        boolean actual = arrayParty.isPalindromicArray(palindromic);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }
    @Test
    public void isPalindromeTest2() {
        //: Given


        boolean expected = false;


        //: When
        boolean actual = arrayParty.isPalindromicArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }
    @Test
    public void packedDuplicates() {
        //: Given
        char[] test = {'a','a','a','b','b','b','r','r','r','a','a','a','r','r', 'r'};

        String expected = "*** Output ***\naaa,bbb,rrr,aaa,rrr";



        //: When
        String actual = arrayParty.packDuplicates(test);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }


    @Test
    public void compress() {
        //: Given
        int[] test = {2,3,3,4,4,6,6};

        String expected = "*** Output ***\n2\n3\n4\n6";



        //: When
        String actual = arrayParty.compress(test);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }


}
