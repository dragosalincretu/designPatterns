package sample.design.patterns.factoryMethod.common;

public abstract class PizzaStore {
    protected PizzaStoreBakery pizzaStoreBakery;

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = pizzaStoreBakery.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected void setPizzaStoreBakery(PizzaStoreBakery pizzaStoreBakery) {
        this.pizzaStoreBakery = pizzaStoreBakery;
    }
}
