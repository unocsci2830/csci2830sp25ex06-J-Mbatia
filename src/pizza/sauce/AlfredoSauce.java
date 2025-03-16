package pizza.sauce;

public class AlfredoSauce extends PizzaSauce {
    @Override
    public String toString() {
        return "Alfredo Sauce";
    }

    @Override
    public double getPrice() { 
        return 1.75;
    }
}
