package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class RomanianVegetarianPizza extends Pizza {

    public RomanianVegetarianPizza(PizzaType type) {
        super(type);
        name = "Romanian Style Sauce and Vegetarian Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add(ToppingType.CORN);
        toppings.add(ToppingType.OLIVES);
        toppings.add(ToppingType.ONIONS);
        toppings.add(ToppingType.GREEN_PEPER);
        toppings.add(ToppingType.RED_PEPER);
        toppings.add(ToppingType.ANANAS);
    }
}
