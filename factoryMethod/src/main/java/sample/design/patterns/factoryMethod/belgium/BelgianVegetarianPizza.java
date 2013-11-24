package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;

public class BelgianVegetarianPizza extends Pizza {

    public BelgianVegetarianPizza(PizzaType type) {
        super(type);
    }
}
