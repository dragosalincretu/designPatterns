package sample.design.patterns.abstractFactory.common;

import sample.design.patterns.abstractFactory.belgium.BelgianStyleCheesePizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStyleClamPizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStylePepperoniPizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStyleVeggiePizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleCheesePizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleClamPizza;
import sample.design.patterns.abstractFactory.romania.RomanianStylePepperoniPizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleVeggiePizza;

public class DependentPizzaStore {
    public Pizza createPizza (PizzaStyle style, PizzaType type) {
        Pizza pizza = null;
        if (style == PizzaStyle.ROMANIAN) {
            switch (type) {
                case CHEESE : pizza = new RomanianStyleCheesePizza();
                    break;
                case VEGGIE : pizza = new RomanianStyleVeggiePizza();
                    break;
                case CLAM : pizza = new RomanianStyleClamPizza();
                    break;
                case PEPPERONI : pizza = new RomanianStylePepperoniPizza();
                    break;
            }
        }
        if (style == PizzaStyle.BELGIAN) {
            switch (type) {
                case CHEESE : pizza = new BelgianStyleCheesePizza();
                    break;
                case VEGGIE : pizza = new BelgianStyleVeggiePizza();
                    break;
                case CLAM : pizza = new BelgianStyleClamPizza();
                    break;
                case PEPPERONI : pizza = new BelgianStylePepperoniPizza();
                    break;
            }
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
