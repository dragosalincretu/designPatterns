package sample.design.patterns.abstractFactory.belgium;

import sample.design.patterns.abstractFactory.belgium.ingredients.BelgiumPizzaIngredientFactory;
import sample.design.patterns.abstractFactory.common.PizzaStore;
import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.PizzaType;

public class BelgianPizzaStore extends PizzaStore {
    @Override
    public Pizza internalCreatePizza(PizzaType pizzaType) {
        Pizza pizza = null;
        pizzaIngredientFactory = new BelgiumPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new BelgianStyleCheesePizza(pizzaIngredientFactory);
                break;
            case VEGGIE:
                pizza = new BelgianStyleVeggiePizza(pizzaIngredientFactory);
                break;
            case CLAM:
                pizza = new BelgianStyleClamPizza(pizzaIngredientFactory);
                break;
            case PEPPERONI:
                pizza = new BelgianStylePepperoniPizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
