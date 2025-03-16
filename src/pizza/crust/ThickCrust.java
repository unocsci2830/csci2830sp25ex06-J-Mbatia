package pizza.crust;
public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;

    public ThickCrust(String ingredient, boolean isDeepDish) {
        super(ingredient);
        this.isDeepDish = isDeepDish;
    }

    @Override
    public String toString() {
        return isDeepDish ? "Thick Deep Dish Crust" : "Thick Crust";
    }

    @Override
    public String checkIntegrity() {
        if (ingredient.equalsIgnoreCase("cauliflower")) {
            return "Warning: This crust is made of cauliflower and may be fragile.";
        }
        return "";
    }

    @Override
    public double getPrice() {
        return isDeepDish ? 4.50 : 4.00;
    }
}
