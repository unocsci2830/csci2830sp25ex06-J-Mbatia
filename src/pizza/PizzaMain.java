package pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pizza.crust.PizzaCrust;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.PizzaSauce;
import pizza.sauce.TomatoSauce;
import pizza.sauce.AlfredoSauce;
import pizza.topping.*;


public class PizzaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of crust would you like:");
        System.out.println("1 - Thin crust");
        System.out.println("2 - Thick crust");
        System.out.print("Your choice: ");
        int crustChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nSelect the crust ingredient:");
        System.out.println("1 - Flour");
        System.out.println("2 - Cauliflower");
        System.out.println("3 - Whole Wheat");
        System.out.print("Your choice: ");
        int ingredientChoice = scanner.nextInt();
        scanner.nextLine();

        String ingredient;
        switch (ingredientChoice) {
        case 1:
            ingredient = "Flour";
            break;
        case 2:
            ingredient = "Cauliflower";
            break;
        case 3:
            ingredient = "Whole Wheat";
            break;
        default:
            ingredient = "Flour";
        }


        boolean isDeepDish = false;
        if (crustChoice == 2) {
            System.out.print("Is it deep dish? (true/false or t/f): ");
            String deepDishInput = scanner.nextLine().trim().toLowerCase();
            isDeepDish = deepDishInput.equals("true") || deepDishInput.equals("t") || deepDishInput.equals("yes");
        }

        PizzaCrust crust = (crustChoice == 1) ? new ThinCrust(ingredient) : new ThickCrust(ingredient, isDeepDish);

        System.out.println("\nWhat kind of sauce would you like:");
        System.out.println("1 - Tomato");
        System.out.println("2 - Alfredo");
        System.out.print("Your choice: ");
        int sauceChoice = scanner.nextInt();
        scanner.nextLine();

        PizzaSauce sauce = (sauceChoice == 1) ? new TomatoSauce() : new AlfredoSauce();

        System.out.println("\nHow many toppings?");
        int numToppings = scanner.nextInt();
        scanner.nextLine();
        List<PizzaTopping> toppings = new ArrayList<>();

        for (int i = 0; i < numToppings; i++) {
            System.out.println("\nSelect topping category:");
            System.out.println("1 - Meat");
            System.out.println("2 - Veggie");
            System.out.println("3 - Cheese");
            System.out.print("Your choice: ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();
        
            switch (categoryChoice) {
                case 1: 
                    System.out.println("\nSelect meat topping:");
                    System.out.println("1 - Sausage");
                    System.out.println("2 - Pepperoni");
                    System.out.print("Your choice: ");
                    int meatChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (meatChoice == 1) {
                        toppings.add(new SausageTopping());
                    } else if (meatChoice == 2) {
                        toppings.add(new PepperoniTopping());
                    } else {
                        System.out.println("Invalid meat choice.");
                    }
                    break;
        
                case 2: 
                    System.out.println("\nSelect veggie topping:");
                    System.out.println("1 - Green Onions");
                    System.out.println("2 - Olives");
                    System.out.print("Your choice: ");
                    int veggieChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (veggieChoice == 1) {
                        toppings.add(new GreenOnionsTopping());
                    } else if (veggieChoice == 2) {
                        toppings.add(new OlivesTopping());
                    } else {
                        System.out.println("Invalid veggie choice.");
                    }
                    break;
        
                case 3: 
                    System.out.println("\nSelect cheese topping:");
                    System.out.println("1 - Mozzarella");
                    System.out.println("2 - Parmesan");
                    System.out.print("Your choice: ");
                    int cheeseChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (cheeseChoice == 1) {
                        toppings.add(new MozzarellaTopping());
                    } else if (cheeseChoice == 2) {
                        toppings.add(new ParmesanTopping());
                    } else {
                        System.out.println("Invalid cheese choice.");
                    }
                    break;
        
                default:
                    System.out.println("Invalid category choice.");
            }
        }
        

        Pizza pizza = new Pizza(crust, sauce, toppings);
        System.out.println("\nYour pizza:");
        System.out.println(pizza);

        String integrityMessage = pizza.checkIntegrity();
        if (!integrityMessage.isEmpty()) {
            System.out.println("\n" + integrityMessage);
        }

        scanner.close();
    }
}
