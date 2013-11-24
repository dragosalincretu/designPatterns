package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class BelgianQuattroStagioniPizza extends Pizza {

    public BelgianQuattroStagioniPizza(PizzaType type) {
        super(type);
        name = "Belgian Style Sauce and Quattro Stagioni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add(ToppingType.BACON);
        toppings.add(ToppingType.MUSHROOMS);
        toppings.add(ToppingType.MOTZARELLA_CHEESE);
        toppings.add(ToppingType.OLIVES);
    }
}
