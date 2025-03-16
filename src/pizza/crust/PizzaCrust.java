package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;

    public PizzaCrust(String ingredient) {
        this.ingredient = ingredient;
    }

    public abstract String toString();

    public String toNiceString() {
        return "Crust: " + toString() + " (Made of " + ingredient + ") ($" + getPrice() + ")";
    }

    public String checkIntegrity() {
        return "";
    }
}
