package pizza.topping;
public class VeggieTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Veggie Topping";
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
