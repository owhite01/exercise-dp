package decorator;

public class Chicken implements Pizza{
    public Chicken(Pizza pizza) {
    }
    @Override
    public String getDesc() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}

