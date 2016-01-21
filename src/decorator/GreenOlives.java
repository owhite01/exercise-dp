package decorator;

public class GreenOlives implements Pizza {
    public GreenOlives(Pizza pizza) {
    }

    @Override
    public String getDesc() {
        return "Green Olives";
    }

    @Override
    public double getPrice() {
        return 5.27;
    }
}
