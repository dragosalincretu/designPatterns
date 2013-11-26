package sample.design.patterns.abstractFactory.belgium;

import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.ingredients.PizzaIngredientFactory;

public class BelgianStyleVeggiePizza extends Pizza {
    public BelgianStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
