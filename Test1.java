package com.iamoperand.RandomQuestions;

/**
 * Created by iamoperand on 29/7/17.
 */
import java.util.*;

public class Test1 {
    public static void main(String args[]) {
       int[] arr = new int[]{1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 9, 10, 11, 12, 8, 9, 10, 21, 35, 36, 37, 22};

        int maxSum = 0, sum = 0, index = 1, startIndex = 0, endIndex = 0, finalStartIndex = 0, finalEndIndex = 0;

        //loop through the array with increment/s by "value from inner-while-loop" or "1"
        while(index <= arr.length){

            //initialIndex to check if the inner loop modifies the value of index or not
            int initialIndex = index - 1;

            sum = 0 + arr[index-1];

            //startIndex for calculation of finalStartIndex
            startIndex = index-1;

            //increment as long as (arr[index] - arr[index-1] == 1) and (index < arr.length)
            while(index < arr.length && arr[index] - arr[index-1] == 1){
                //increase the value of sum
                sum += arr[index];
                index++;
            }

            //if the value of index is the same as initialIndex i.e. inner-while-loop didn't modify the value of index
            if(initialIndex == (index - 1)){
                //increment index by 1 in that case
                index++;
            } else {

                //endIndex for calculation of finalEndIndex
                endIndex = index - 1;

                //if the sum calculated is greater than maxSum
                if(sum > maxSum){

                    //replace maxSum with sum
                    maxSum = sum;

                    //Calculate the values of finalStartIndex and finalEndIndex
                    finalStartIndex = startIndex;
                    finalEndIndex = endIndex;
                }
            }
        }

        //Print the result
        System.out.println(maxSum);

        //for ensuring the case of {1, 37, 22} where there is no subsequence
        if(finalEndIndex > finalStartIndex){
            for(int i=finalStartIndex; i<=finalEndIndex; i++ ){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
