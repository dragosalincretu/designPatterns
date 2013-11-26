package sample.design.patterns.abstractFactory.common;

import sample.design.patterns.abstractFactory.common.ingredients.*;

import static java.lang.System.out;

public abstract class Pizza {
    protected PizzaIngredientFactory pizzaIngredientFactory;
    private String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
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

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public Clams getClams() {
        return clams;
    }
}
