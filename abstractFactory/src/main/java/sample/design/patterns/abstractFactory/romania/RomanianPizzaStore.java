package sample.design.patterns.abstractFactory.romania;

import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.PizzaStore;
import sample.design.patterns.abstractFactory.common.PizzaType;
import sample.design.patterns.abstractFactory.romania.ingredients.RomaniaPizzaIngredientFactory;

public class RomanianPizzaStore extends PizzaStore {
    @Override
    public Pizza internalCreatePizza(PizzaType pizzaType) {
        Pizza pizza = null;
        pizzaIngredientFactory = new RomaniaPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new RomanianStyleCheesePizza(pizzaIngredientFactory);
                break;
            case VEGGIE:
                pizza = new RomanianStyleVeggiePizza(pizzaIngredientFactory);
                break;
            case CLAM:
                pizza = new RomanianStyleClamPizza(pizzaIngredientFactory);
                break;
            case PEPPERONI:
                pizza = new RomanianStylePepperoniPizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
