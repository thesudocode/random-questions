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

        for(int i=0; i<size; i++){

            int pos = indexArray[i];
            System.out.println("Position is: " + pos);

            if(pos == i){

                continue;
            }else{
               //swap(valueArray, i, pos);
                System.out.println("Swapping " + i + " with " + pos);

                int temp = valueArray[pos];
                valueArray[pos] = valueArray[i];
                valueArray[i] = temp;

                int temp2 = indexArray[pos];
                indexArray[pos] = indexArray[i];
                indexArray[i] = temp2;
            }
            for(int counter=0; counter<size; counter++){

                System.out.print(valueArray[counter] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<size; i++){

            System.out.print(valueArray[i] + " ");
        }
        System.out.println();

    }
}
