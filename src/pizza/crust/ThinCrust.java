package pizza.crust;
public class ThinCrust extends PizzaCrust {
    public ThinCrust(String ingredient) {
        super(ingredient);
    }

    @Override
    public String toString() {
        return "Thin Crust";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
