package sample.design.patterns.abstractFactory.belgium;

import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.ingredients.PizzaIngredientFactory;

public class BelgianStyleCheesePizza extends Pizza {
    public BelgianStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
