package com.iamoperand.RandomQuestions;

import java.util.Scanner;

/**
 * Created by iamoperand on 4/8/17.
 */
public class Question2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\\D");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] db = new int[m][n];

        String[] inputString = new String[m];
        Scanner inputStringScanner = new Scanner(System.in);
        for(int i=0; i<m; i++){
            inputString[i] = inputStringScanner.nextLine();
        }


        for(int i=0; i<m; i++){
            String[] splitString = inputString[i].split(",");

            //System.out.println("The length is: " + splitString.length);
            for(int j=0; j<splitString.length; j++){
                db[i][j] = Integer.parseInt(splitString[j]);
            }
        }

        for(int i=0; i<m; i++){

                System.out.println(inputString[i]);
        }

    }
}
