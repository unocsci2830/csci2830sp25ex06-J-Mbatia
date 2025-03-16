package pizza.sauce;

public class TomatoSauce extends PizzaSauce {
    @Override
    public String toString() {
        return "Tomato Sauce";
    }

    @Override
    public double getPrice() { 
        return 1.50;
    }
}
