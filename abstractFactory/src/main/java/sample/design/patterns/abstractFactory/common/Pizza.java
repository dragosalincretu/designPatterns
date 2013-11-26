package sample.design.patterns.abstractFactory.common;

import sample.design.patterns.abstractFactory.common.ingredients.*;

import static java.lang.System.out;

public abstract class Pizza {
    private String name;

    private Dough dough;
    private Sauce sauce;
    private Veggies veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;
    public abstract void prepare();

    public void bake() {
        out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
