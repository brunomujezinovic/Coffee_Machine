package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int water =400;
        int milk =540;
        int coffee =120;
        int cups =9;
        int pare= 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$"+pare + " of money");
        System.out.println("");

        String akcija;
        System.out.println("Write action (buy, fill, take):");
        akcija = s.next();

        switch (akcija) {

            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int a= s.nextInt();
                if (a==1){
                    System.out.println("The coffee machine has:");
                    System.out.println((water - 250) +  " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println((coffee - 16) + " g of coffee beans");
                    System.out.println((cups - 1) + " disposable cups");
                    System.out.println("$"+(pare + 4) + " of money");
                }
                if (a==2){
                    System.out.println("The coffee machine has:");
                    System.out.println((water - 350) +  " ml of water");
                    System.out.println((milk - 75) + " ml of milk");
                    System.out.println((coffee - 20) + " g of coffee beans");
                    System.out.println((cups - 1) + " disposable cups");
                    System.out.println("$"+(pare + 7) + " of money");
                }
                if (a==3){
                    System.out.println("The coffee machine has:");
                    System.out.println((water - 200) +  " ml of water");
                    System.out.println((milk - 100) + " ml of milk");
                    System.out.println((coffee - 12) + " g of coffee beans");
                    System.out.println((cups - 1) + " disposable cups");
                    System.out.println("$"+(pare + 6) + " of money");
                }

                break;

            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int addwater= s.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addmilk= s.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addcoffee= s.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int addcups= s.nextInt();

                System.out.println("The coffee machine has:");
                System.out.println((water +addwater) +  " ml of water");
                System.out.println((milk + addmilk) + " ml of milk");
                System.out.println((coffee +addcoffee) + " g of coffee beans");
                System.out.println((cups + addcups) + " disposable cups");
                System.out.println("$"+pare + " of money");

                break;

            case "take":

                System.out.println("I gave you $"+pare);

                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(coffee + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$" + 0 + " of money");





            default:
                System.out.println("");


        }

    }

}