package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class BelgianQuattroFormaggiPizza extends Pizza {

    public BelgianQuattroFormaggiPizza(PizzaType type) {
        super(type);
        name = "Belgian Style Sauce and Quattro Formaggi Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add(ToppingType.CEDAR_CHEESE);
        toppings.add(ToppingType.GRUYERE_CHEESE);
        toppings.add(ToppingType.MOTZARELLA_CHEESE);
        toppings.add(ToppingType.PARMESAN_CHEESE);
    }
}
