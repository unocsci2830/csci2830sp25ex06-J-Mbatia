package pizza.topping;
public class CheeseTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Cheese Topping";
    }

    @Override
    public double getPrice() {
        return 1.75;
    }
}

