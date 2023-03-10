
package exerciciodecorator;


public class ExercicioDecorator {

    
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza); // add cheese topping
        System.out.println(pizza.getDescription()); // output: "Pizza simples, queijo"
        System.out.println(pizza.getCost()); // output: 12.0
    }
    
}
