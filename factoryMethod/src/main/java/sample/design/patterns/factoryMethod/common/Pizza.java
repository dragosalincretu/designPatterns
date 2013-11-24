package sample.design.patterns.factoryMethod.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected PizzaType type;
    private List<ToppingType> toppings = new ArrayList<>();

    public Pizza(PizzaType type) {
        this.type = type;
    }

    public void prepare() {
        System.out.println("Preparing " + type);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (ToppingType topping: toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza into official PizzaStore box");
    }
}
