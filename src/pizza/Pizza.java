package pizza;

import java.util.List;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

import java.util.List;
import java.util.ArrayList;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private List<PizzaTopping> toppings;
    private List<MenuItem> menuItems;

    public Pizza(PizzaCrust crust, PizzaSauce sauce, List<PizzaTopping> toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.menuItems = new ArrayList<>();
        menuItems.add(crust);
        menuItems.add(sauce);
        menuItems.addAll(toppings);
    }

    @Override
    public double getPrice() {
        return menuItems.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public String checkIntegrity() {
        return crust.checkIntegrity();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(crust.toNiceString()).append("\n");
        sb.append(sauce.toNiceString()).append("\n");
        toppings.forEach(t -> sb.append(t.toNiceString()).append("\n"));
        sb.append("Total Price: $").append(getPrice());
        return sb.toString();
    }
}
