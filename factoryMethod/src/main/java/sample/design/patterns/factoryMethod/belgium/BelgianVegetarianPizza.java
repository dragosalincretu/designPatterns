package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 2:31 AM
 */
public class BelgianVegetarianPizza extends Pizza {

    public BelgianVegetarianPizza(PizzaType type) {
        super(type);
    }
}
