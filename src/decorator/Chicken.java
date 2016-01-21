package decorator;

public class Chicken implements Pizza{
    public Chicken(Pizza pizza) {
    }
    @Override
    public String getDesc() {
        return "Chicken";
    }

    @Override
    public double getPrice() {
        return 12.50;
    }
}

