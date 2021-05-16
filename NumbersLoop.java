package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersLoop {
    public static void numbersLoop(){

        int numArray[] = new int[5];

        for (int i=0;i<5;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter number "+(i+1)+":");
            int num = input.nextInt();
            numArray[i] = num;
        }

        int sum=0;

        for (int i=0;i<numArray.length; i++) {
            sum= sum +numArray[i];
        }

        System.out.println("Your sum is: "+sum);

        int product=1;

        for (int i=0;i<numArray.length; i++) {
            product= product *numArray[i];
        }

        System.out.println("Your product is: "+product);

        int temp;

        for (int i = 0; i < numArray.length; i++)
        {
            for (int j = i + 1; j < numArray.length; j++)
            {
                if (numArray[i] > numArray[j])
                {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("Your smallest number is: "+numArray[0]);
        System.out.println("Your largest number is: "+numArray[4]);
    }
}



