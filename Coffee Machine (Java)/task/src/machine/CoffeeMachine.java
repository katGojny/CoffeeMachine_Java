package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        String mainMenu = "Write action (buy, fill, take, remaining, exit):";
        System.out.println(mainMenu);
        while (scanner.hasNext()){

            String action = scanner.next();
            if (action.contains("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String whichCoffee = scanner.next();
                int waterForCoffee = 0;
                int milkForCoffee = 0;
                int coffeeForCoffee = 0;
                int cupForCoffee = 1;
                int coffeeMoney = 0;

                switch (whichCoffee) {
                    case "1": //espresso
                        waterForCoffee = 250;
                        coffeeForCoffee = 16;
                        coffeeMoney = 4;
                        break;
                    case "2": //latte
                        waterForCoffee = 350;
                        milkForCoffee = 75;
                        coffeeForCoffee = 20;
                        coffeeMoney = 7;
                        break;
                    case "3": //cappuccino
                        waterForCoffee = 200;
                        milkForCoffee = 100;
                        coffeeForCoffee = 12;
                        coffeeMoney = 6;
                        break;
                    case "back":
                        break;
                } if (!whichCoffee.contains("back")) {
                    if (howManyCups(whichCoffee, water, milk, coffee) >= 1 && cups >= cupForCoffee) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - waterForCoffee;
                        milk = milk - milkForCoffee;
                        coffee = coffee - coffeeForCoffee;
                        cups = cups - cupForCoffee;
                        money = money + coffeeMoney;
                    } else if (water < waterForCoffee) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milk < milkForCoffee) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (coffee < coffeeForCoffee) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cups < coffeeForCoffee) {
                        System.out.println("Sorry, not enough cups!");
                    }
                }

                System.out.println("\n" +mainMenu);

            } else if (action.contains("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                water = water + scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk = milk + scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                coffee = coffee + scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                cups = cups + scanner.nextInt();

                System.out.println("\n" +mainMenu);

            } else if (action.contains("take")) {
                System.out.printf("I gave you $%d", money);
                money = 0;

                System.out.println("\n" +mainMenu);

            } else if (action.contains("remaining")) {
                machineHas(water, milk, coffee, cups, money);

                System.out.println("\n" +mainMenu);
            } else if (action.contains("exit")) {
             break;
            }
        }
    }
    private static int howManyCups(String whichCoffee, int waterInput, int milkInput, int coffeeInput) { // it counts how many cups can you made
        int waterInCup = 1;
        int milkInCup = 1;
        int coffeeInCup = 1;
        switch (whichCoffee) {
            case "1" -> { // espresso
                waterInCup = 250;
                coffeeInCup = 16;
            }
            case "2" -> { // latte
                waterInCup = 350;
                milkInCup = 75;
                coffeeInCup = 20;
            }
            case "3" -> { // cappuccino
                waterInCup = 200;
                milkInCup = 100;
                coffeeInCup = 12;
            }
        }
        int water = waterInput / waterInCup;
        int milk = milkInput / milkInCup;
        int coffee = coffeeInput / coffeeInCup;
        int amountOfCups;
        if (water == milk && water == coffee) {
            amountOfCups = water;
        } else {
            amountOfCups = Math.min(water, Math.min(milk, coffee));
        }
        return amountOfCups;
    }
    private static void machineHas(int water, int milk, int coffee, int cups, int money){
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                %d of money""", water, milk, coffee, cups, money);
    }
    private static void howManyCanIMake(int cupsOfCoffee, int howManyCups){
        if (cupsOfCoffee == howManyCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffee < howManyCups) {
            int more = howManyCups - cupsOfCoffee;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", more);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", howManyCups);
        }
    }
}
