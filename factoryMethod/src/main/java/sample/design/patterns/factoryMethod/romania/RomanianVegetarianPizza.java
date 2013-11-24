package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaType;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:33 AM
 */
public class RomanianVegetarianPizza extends Pizza {

    public RomanianVegetarianPizza(PizzaType type) {
        super(type);
    }
}
