package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class RomanianQuattroFormaggiPizza extends Pizza {

    public RomanianQuattroFormaggiPizza(PizzaType type) {
        super(type);
        name = "Romanian Style Sauce and Quattro Formaggi Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add(ToppingType.GRUYERE_CHEESE);
        toppings.add(ToppingType.MOTZARELLA_CHEESE);
        toppings.add(ToppingType.CEDAR_CHEESE);
        toppings.add(ToppingType.PARMESAN_CHEESE);
    }
}
