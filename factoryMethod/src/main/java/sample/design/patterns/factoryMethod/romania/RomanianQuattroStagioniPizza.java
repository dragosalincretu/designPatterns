package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

public class RomanianQuattroStagioniPizza extends Pizza {

    public RomanianQuattroStagioniPizza(PizzaType type) {
        super(type);
        name = "Romanian Style Sauce and Quattro Stagioni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add(ToppingType.BACON);
        toppings.add(ToppingType.OLIVES);
        toppings.add(ToppingType.MUSHROOMS);
        toppings.add(ToppingType.MOTZARELLA_CHEESE);
    }
}
