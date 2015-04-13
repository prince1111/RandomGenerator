package cst1201;

import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {

        //TODO: Create a Scanner object to read keyboard input.
        //TODO: Ask the user a lower and upper bound.
        //TODO: Ask the user for the number of random integers to generate.
        //TODO: Generate random integers of the desired length and bound.
        //TODO: Print the average, max, min, count, and sum of the integers.
        // set sum/ count 
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input a lowerbound:  ");
        int sum = 0;
        int lowerbound = scanner.nextInt();

        System.out.println("please input a upperbound: ");
        int upperbound = scanner.nextInt();

        int randomnumber;
        if (upperbound > lowerbound) {

            System.out.print("max is ");
            System.out.println(upperbound);

            System.out.print("min is ");
            System.out.println(lowerbound);

            for (int min = lowerbound; min <= upperbound; min++) {
                System.out.print(" count:      " + min);

                randomnumber = lowerbound + (int) (Math.random() * upperbound);
                sum += randomnumber;

            }

            System.out.print("sum" + sum);

            System.out.println("Average " + sum / upperbound);

            ///randomnumber = lowerbound + (int) (Math.random()  * upperbound);
            //System.out.print(randomnumber);}
        } else {
            System.out.print("Sorry, but the upperbound has to be of higher value");
        }

    }

}
