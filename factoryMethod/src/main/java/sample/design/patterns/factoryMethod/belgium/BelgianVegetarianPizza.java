package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class BelgianVegetarianPizza extends Pizza {

    public BelgianVegetarianPizza(PizzaType type) {
        super(type);

        name = "Belgian Style Sauce and Vegetarian Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add(ToppingType.OLIVES);
        toppings.add(ToppingType.ANANAS);
        toppings.add(ToppingType.GREEN_PEPER);
        toppings.add(ToppingType.RED_PEPER);
        toppings.add(ToppingType.ONIONS);
        toppings.add(ToppingType.CORN);
    }
}
