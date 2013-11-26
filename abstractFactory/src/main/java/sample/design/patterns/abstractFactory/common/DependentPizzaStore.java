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
    public Pizza createPizza (String style, String type) {
        Pizza pizza = null;
        if (style.equals("Romania")) {
            switch (type) {
                case "cheese" : pizza = new RomanianStyleCheesePizza();
                    break;
                case "veggie" : pizza = new RomanianStyleVeggiePizza();
                    break;
                case "clam" : pizza = new RomanianStyleClamPizza();
                    break;
                case "pepperoni" : pizza = new RomanianStylePepperoniPizza();
                    break;
            }
        }
        if (style.equals("Belgium")) {
            switch (type) {
                case "cheese" : pizza = new BelgianStyleCheesePizza();
                    break;
                case "veggie" : pizza = new BelgianStyleVeggiePizza();
                    break;
                case "clam" : pizza = new BelgianStyleClamPizza();
                    break;
                case "pepperoni" : pizza = new BelgianStylePepperoniPizza();
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
