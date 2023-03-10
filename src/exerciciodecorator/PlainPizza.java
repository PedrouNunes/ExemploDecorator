
package exerciciodecorator;

class PlainPizza implements Pizza {
    public String getDescription() {
        return "Pizza simples";
    }

    public double getCost() {
        return 10.0;
    }
}
