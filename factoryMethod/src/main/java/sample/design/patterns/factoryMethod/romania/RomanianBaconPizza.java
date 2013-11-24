package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class RomanianBaconPizza extends Pizza {

    public RomanianBaconPizza(PizzaType type) {
        super(type);
        name = "Romanian Style Sauce and Bacon Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add(ToppingType.BACON);
    }
}
