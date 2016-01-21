package decorator;

public class Meat implements Pizza{
    public Meat(Pizza pizza) {
    }
    @Override
    public String getDesc() {
        return "Meat";
    }

    @Override
    public double getPrice() {
        return 14.25;
    }
}
