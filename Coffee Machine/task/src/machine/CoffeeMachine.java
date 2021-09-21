package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {


        // System.out.println("For 125 cups of coffee you will need:");
        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner s = new Scanner(System.in);
        int water = s.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = s.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = s.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = s.nextInt();

        int rwater = water / 200;
        int rmilk = milk / 50;
        int rcoffee = coffee / 15;

        int smallest = Math.min(rwater, Math.min(rmilk, rcoffee));


        if (cups < smallest) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (smallest - cups) + " more than that)");
        }
        if (cups > smallest) {
            System.out.println("No, I can make only " + smallest + " cup(s) of coffee");
        }
        if (smallest == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        }


    }
}