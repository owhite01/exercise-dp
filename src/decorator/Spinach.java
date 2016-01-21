package decorator;

public class Spinach implements Pizza{

    private Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return "Spinach";
    }

    @Override
    public double getPrice() {
        return 7.92;
    }
}
