package pizza.topping;
public class MeatTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Meat Topping";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
