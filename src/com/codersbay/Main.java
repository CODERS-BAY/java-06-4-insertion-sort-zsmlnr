package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Insertion Sort.

        int [] array={12, 23, 35, 1, 9};        // We made an int Array.
        for(int i = 0; i < array.length; i++){  //Then we created a "for loop", for working through the Array list. From the first value to the last.
            int arrayValue = array[i];          //We storing our Array value into an int.
            int loopValue = i;                  // We storing our "loop value" into an int.

            System.out.println(arrayValue);     // Our list is at the time is unsorted.

            while (loopValue > 0 && arrayValue < array[loopValue-1]){   // We have created a "while loop" for the swapping.
                array [loopValue]= array [loopValue-1];                 //Here is our new value stored, and replaced.
                loopValue--;                                            // Jump backwards and check the values.


            }
            array[loopValue] = arrayValue;                  // We saving our new Array value.
        }
        System.out.println(Arrays.toString(array));         //Our Array list is with the Insertion Sort method sorted.

    }

}