package main.java.challenges;

import java.util.Arrays;

public class ArrayReverse{

    public static void main(String[] args){ 
        
        int[] inputIntArray = {1,2,3,4,5,6};
        System.out.println("Before Reversing (Loop):" + Arrays.toString(inputIntArray));

        // Array Reverse loop       
        reverseArrayLoop (inputIntArray);

        // Array Reverse recursion
        char[] inputCharArray = {'a','b','c','d','e'};
        int startIndex = 0;
        System.out.println("Before Reversing (recursion) :" + Arrays.toString(inputCharArray));
        reverseArrayRecursion(inputCharArray,startIndex);
        System.out.println("After Reversing (recursion) :" + Arrays.toString(inputCharArray));

    }

     /**
     * Reversing an array of chars using recursion
     * 
     * @param input
     *            int array
     * @return nothing
     */
    public static void reverseArrayLoop(int[] input){

        int value = 0;
        int j = 0; 
        for(int i = 0; i<input.length;i++){
            value = input[i] ;
            j = input.length - i - 1;
            
            // Break once you reach the mid point of array length
            if(j<=i){
                break;
            }

            input[i] = input[j];
            input[j] = value;
        }

        System.out.println("After Reversing (Loop) :" + Arrays.toString(input));
    }

    /**
     * Reversing an array of chars using Recursion
     * 
     * @param input
     *            charactr array
     * @return nothing
     */
    public static void reverseArrayRecursion(char[] input,int startIndex){
        
        char value = ' ';
        int endIndex = input.length - startIndex - 1;
            
        // Break once you reach the mid point of array length
        if(endIndex>startIndex){
            value = input[startIndex] ;
            input[startIndex] = input[endIndex];
            input[endIndex] = value;
            reverseArrayRecursion(input,++startIndex);
        }        
    }
}
