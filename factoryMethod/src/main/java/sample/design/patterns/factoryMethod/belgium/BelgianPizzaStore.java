package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;

import static sample.design.patterns.factoryMethod.common.PizzaType.*;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:19 AM
 */
public class BelgianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case VEGETARIAN:
                return new BelgianVegetarianPizza(pizzaType);
            case QUATTRO_STAGIONI:
                return new BelgianQuattroStagioniPizza(pizzaType);
            case QUATTRO_FORMAGGI:
                return new BelgianQuattroFormaggiPizza(pizzaType);
            case BACON:
                return new BelgianBaconPizza(pizzaType);
        }
        return null;
    }
}
