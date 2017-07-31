package com.iamoperand.RandomQuestions;

/**
 * Created by iamoperand on 29/7/17.
 */
import java.util.*;

public class Test1 {
    public static void main(String args[]) {
       int[] arr = new int[]{1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 9, 10, 11, 12, 8, 9, 10, 21, 35, 36, 37, 22};

        int maxSum = 0, sum = 0;
        int index = 1;
        int startIndex = 0, endIndex = 0, finalStartIndex = 0, finalEndIndex = 0;

        while(index <= arr.length){
            int initialIndex = index - 1;
            System.out.println("outer Index is: " + index);
            sum = 0 + arr[index-1];
            startIndex = index-1;
            while(index < arr.length && arr[index] - arr[index-1] == 1){

                System.out.println("Inside inner while: " + (index+1));
                sum += arr[index];
                System.out.println("maxSum is: " + maxSum);
                index++;
                System.out.println("initialIndex is: " + initialIndex);
                System.out.println("index is: " + index);

            }
            System.out.println("outer initialIndex is: " + initialIndex);
            System.out.println("outer index is: " + index);


            if(initialIndex == (index - 1)){
                System.out.println("if initialIndex is: " + initialIndex);
                System.out.println("if index is: " + index);
                index++;
                System.out.println("initialIndex == index: true ");
            } else {
                endIndex = index - 1;
                if(sum > maxSum){

                    maxSum = sum;
                    System.out.println("maxSum is: " + maxSum);
                    finalStartIndex = startIndex;
                    finalEndIndex = endIndex;
                }
            }
        }

        System.out.println("Maxsum is: " + maxSum);
        System.out.println("finalStartIndex is: " + finalStartIndex);
        System.out.println("finalEndIndex is: " + finalEndIndex);
        for(int i=finalStartIndex; i<=finalEndIndex; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
