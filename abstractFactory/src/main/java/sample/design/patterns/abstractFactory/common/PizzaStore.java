package sample.design.patterns.abstractFactory.common;

import sample.design.patterns.abstractFactory.common.ingredients.PizzaIngredientFactory;

public abstract class PizzaStore {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public abstract Pizza internalCreatePizza(PizzaType type);

    public Pizza createPizza (PizzaType type) {
        Pizza pizza = internalCreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
