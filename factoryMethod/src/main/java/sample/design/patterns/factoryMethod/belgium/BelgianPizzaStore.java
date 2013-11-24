package sample.design.patterns.factoryMethod.belgium;

import sample.design.patterns.factoryMethod.common.PizzaStore;

public class BelgianPizzaStore extends PizzaStore {
    public BelgianPizzaStore() {
        pizzaStoreBakery = new BelgianPizzaStoreBakery();
    }
}
