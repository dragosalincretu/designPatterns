package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStoreBakery;
import sample.design.patterns.factoryMethod.common.PizzaType;

public class BelgianPizzaStoreBakery implements PizzaStoreBakery {
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
