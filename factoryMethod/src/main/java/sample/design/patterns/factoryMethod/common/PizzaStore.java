package sample.design.patterns.factoryMethod.common;

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
