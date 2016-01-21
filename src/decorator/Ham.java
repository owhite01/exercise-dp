package decorator;

public class Ham extends PizzaDecorator{

    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc()
    {
        return pizza.getDesc() + "Ham("+ getPrice() + ")";
    }

    @Override
    public double getPrice() {
        return 8.12;
    }
}
