package sample.design.patterns.abstractFactory.belgium.ingredients;

import sample.design.patterns.abstractFactory.common.ingredients.*;

public class BelgiumPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDougd();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }

    @Override
    public Cheese creteCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return  veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
