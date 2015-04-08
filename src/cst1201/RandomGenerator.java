package cst1201;

import java.util.Scanner;
import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        int max = 0;

        Scanner keyboard = new Scanner(System.in);  //TODO: Create a Scanner object to read keyboard input.

        System.out.print("What is the lower bound  ");//TODO: Ask the user a lower bound.
        int lower = keyboard.nextInt();
        System.out.print("What is the upper bound  ");//TODO: Ask the user a  upper bound.
        int upper = keyboard.nextInt();

        int min = lower;

        System.out.print("the number of random integers to generate  ");//TODO: Ask the user for the number of random integers to generate.
        int numofran = keyboard.nextInt();

        for (int i = 0; i < numofran; i++) {  //TODO: Generate random integers of the desired length and bound.
            Random random = new Random();
            int num = random.nextInt((upper - lower) + 1) + lower;
            System.out.println(num);
            avg += num;
            sum += num;//find the sum
            if (max < num) {//find the maximum
                max = num;
            }
            for (int i2 = 0; i2 < max; i2++) {

                if (num < lower) {
                    lower++;
                    min = lower;//find the minimum

                }
            }
        }

        avg = avg / numofran;//Find the average
        //TODO: Print the average, max, min, count, and sum of the integers.
        System.out.println("Average:  " + avg);
        System.out.println("Sum：  " + sum);
        System.out.println("Num of integer:   " + numofran);//Count
        System.out.println("minimum:  " + min);
        System.out.println("maximum:  " + max);

    }
}
