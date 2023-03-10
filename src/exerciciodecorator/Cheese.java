package exerciciodecorator;


class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", queijo";
    }

    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
