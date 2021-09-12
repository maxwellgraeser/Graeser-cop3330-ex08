/*
 *  UCF COP3330 Fall 2021 Exercise 8 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class PizzaParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = scan.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = scan.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = scan.nextInt();

        int totalSlices = slices * pizza;
        int remainingSlices = totalSlices % people;
        int slicesPerPerson = totalSlices / people;

        System.out.println(String.format("there are %d people with %d pizzas (%d slices)\nEach person gets %d slices\nThere are %d slices remaining", people, pizza, totalSlices, slicesPerPerson, remainingSlices));
    }
}