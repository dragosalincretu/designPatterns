package sample.design.patterns.abstractFactory.romania.ingredients;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.abstractFactory.common.ingredients.*;

import static org.fest.assertions.Assertions.assertThat;

public class RomaniaPizzaIngredientFactoryTest {
    private PizzaIngredientFactory pizzaIngredientFactory;

    @Before
    public void setUp() {
        pizzaIngredientFactory = new RomaniaPizzaIngredientFactory();
    }

    @Test
    public void testCreateDough() throws Exception {
        assertThat(pizzaIngredientFactory.createClams()).isInstanceOf(FrozenClams.class);
    }

    @Test
    public void testCreateSauce() throws Exception {
        assertThat(pizzaIngredientFactory.createSauce()).isInstanceOf(PlumTomatoSauce.class);
    }

    @Test
    public void testCreteCheese() throws Exception {
        assertThat(pizzaIngredientFactory.createCheese()).isInstanceOf(MozzarellaCheese.class);
    }

    @Test
    public void testCreateVeggies() throws Exception {
        Veggies[] veggies = pizzaIngredientFactory.createVeggies();
        assertThat(veggies).hasSize(3);
        assertThat(veggies[0]).isInstanceOf(EggPlant.class);
        assertThat(veggies[1]).isInstanceOf(Spinach.class);
        assertThat(veggies[2]).isInstanceOf(BlackOlives.class);
    }

    @Test
    public void testCreatePepperoni() throws Exception {
        assertThat(pizzaIngredientFactory.createPepperoni()).isInstanceOf(SlicedPepperoni.class);
    }

    @Test
    public void testCreateClams() throws Exception {
        assertThat(pizzaIngredientFactory.createClams()).isInstanceOf(FrozenClams.class);
    }
}
