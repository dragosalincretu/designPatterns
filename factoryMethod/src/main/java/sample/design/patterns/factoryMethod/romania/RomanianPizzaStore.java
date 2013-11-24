package sample.design.patterns.factoryMethod.romania;

import sample.design.patterns.factoryMethod.common.PizzaStore;

public class RomanianPizzaStore extends PizzaStore {
    public RomanianPizzaStore() {
        pizzaStoreBakery = new RomanianPizzaStoreBakery();
    }
}
