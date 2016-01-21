package decorator;

public class Cheese implements Pizza{
    public Cheese(Pizza pizza) {
    }
    @Override
    public String getDesc() {
        return "CHeese";
    }

    @Override
    public double getPrice() {
        return 20.71;
    }
}
