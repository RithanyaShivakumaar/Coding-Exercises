// PizzaShop.java

import java.util.Scanner;

public class PizzaShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza = null;

        // Step 1: Select Base Pizza
        System.out.println("Welcome to the Pizza Shop!");
        System.out.println("Please choose a pizza base:");
        System.out.println("1. Margherita Pizza - $5.00");
        System.out.println("2. Pepperoni Pizza - $6.00");
        System.out.println("3. Veggie Pizza - $7.00");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                pizza = new MargheritaPizza();
                break;
            case 2:
                pizza = new PepperoniPizza();
                break;
            case 3:
                pizza = new VeggiePizza();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Margherita Pizza.");
                pizza = new MargheritaPizza();
                break;
        }

        // Step 2: Add Toppings
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Choose a topping to add:");
            System.out.println("1. Cheese - $1.50");
            System.out.println("2. Olives - $1.00");
            System.out.println("3. Mushrooms - $1.25");
            System.out.println("4. No more toppings");
            int toppingChoice = scanner.nextInt();

            switch (toppingChoice) {
                case 1:
                    pizza = new Cheese(pizza);
                    break;
                case 2:
                    pizza = new Olives(pizza);
                    break;
                case 3:
                    pizza = new Mushrooms(pizza);
                    break;
                case 4:
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    break;
            }
        }

        // Step 3: Display Final Order
        System.out.println("\nYour final pizza order:");
        System.out.println(pizza.getDescription() + " $" + pizza.getPrice());

        scanner.close();
    }
}
