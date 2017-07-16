package com.iamoperand.RandomQuestions;

import java.util.Scanner;

/**
 * Created by iamoperand on 16/7/17.
 */
public class Question1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the size of the array?");
        int size = scanner.nextInt();

        int[] valueArray = new int[size];
        int[] indexArray = new int[size];

        System.out.println("Enter the values of the array...");
        for(int i=0; i<size; i++){
            valueArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the corresponding positions in the index array...");
        for(int i=0; i<size; i++){
            indexArray[i] = scanner.nextInt();
        }

        /*
        I have used the implementation of Insertion Sort here.
        If you want to decrease the time your algorithm takes, then you can use the implementation of Quick Sort here.
         */
        for(int i=1; i<size; i++){

                int indexKey = indexArray[i];
                int valueKey = valueArray[i];
                int j = i-1;
                while(j>=0 && indexArray[j]>indexKey){
                    indexArray[j+1] = indexArray[j];
                    valueArray[j+1] = valueArray[j];
                    j--;
                }
                indexArray[j+1] = indexKey;
                valueArray[j+1] = valueKey;
            }


        //Print the 2 sorted arrays for inspection
        System.out.println("The sorted valueArray is");
            for(int i=0; i<size; i++){

            System.out.print(valueArray[i] + " ");
        }
        System.out.println();


        System.out.println("The sorted indexArray is");
        for(int i=0; i<size; i++){

            System.out.print(indexArray[i] + " ");
        }
        System.out.println();

    }
}
