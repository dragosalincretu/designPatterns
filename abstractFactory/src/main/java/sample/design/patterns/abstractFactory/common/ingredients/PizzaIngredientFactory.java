package sample.design.patterns.abstractFactory.common.ingredients;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese creteCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
