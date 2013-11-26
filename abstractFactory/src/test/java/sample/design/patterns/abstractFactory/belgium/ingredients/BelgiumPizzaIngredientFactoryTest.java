package sample.design.patterns.abstractFactory.belgium.ingredients;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.abstractFactory.common.ingredients.*;

import static org.fest.assertions.Assertions.assertThat;

public class BelgiumPizzaIngredientFactoryTest {
    private PizzaIngredientFactory pizzaIngredientFactory;

    @Before
    public void setUp() {
        pizzaIngredientFactory = new BelgiumPizzaIngredientFactory();
    }

    @Test
    public void testCreateDough() throws Exception {
        assertThat(pizzaIngredientFactory.createClams()).isInstanceOf(FreshClams.class);
    }

    @Test
    public void testCreateSauce() throws Exception {
         assertThat(pizzaIngredientFactory.createSauce()).isInstanceOf(MarianaSauce.class);
    }

    @Test
    public void testCreteCheese() throws Exception {
         assertThat(pizzaIngredientFactory.creteCheese()).isInstanceOf(ReggianoCheese.class);
    }

    @Test
    public void testCreateVeggies() throws Exception {
        Veggies[] veggies = pizzaIngredientFactory.createVeggies();
        assertThat(veggies).hasSize(4);
        assertThat(veggies[0]).isInstanceOf(Garlic.class);
        assertThat(veggies[1]).isInstanceOf(Onion.class);
        assertThat(veggies[2]).isInstanceOf(Mushroom.class);
        assertThat(veggies[3]).isInstanceOf(RedPepper.class);
    }

    @Test
    public void testCreatePepperoni() throws Exception {
         assertThat(pizzaIngredientFactory.createPepperoni()).isInstanceOf(SlicedPepperoni.class);
    }

    @Test
    public void testCreateClams() throws Exception {
        assertThat(pizzaIngredientFactory.createClams()).isInstanceOf(FreshClams.class);
    }
}
