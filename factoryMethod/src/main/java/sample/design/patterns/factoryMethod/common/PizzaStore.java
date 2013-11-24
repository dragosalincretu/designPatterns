package sample.design.patterns.factoryMethod.common;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:15 AM
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
