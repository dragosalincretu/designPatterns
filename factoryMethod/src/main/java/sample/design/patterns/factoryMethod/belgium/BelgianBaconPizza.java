package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class BelgianBaconPizza extends Pizza {

    public BelgianBaconPizza(PizzaType type) {
        super(type);
        name = "Belgian Style Sauce and Bacon Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add(ToppingType.BACON);
    }
}
