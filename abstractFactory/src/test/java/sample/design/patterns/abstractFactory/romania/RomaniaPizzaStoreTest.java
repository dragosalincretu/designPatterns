package sample.design.patterns.abstractFactory.romania;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.PizzaStore;
import sample.design.patterns.abstractFactory.common.PizzaType;
import sample.design.patterns.abstractFactory.common.ingredients.SlicedPepperoni;
import sample.design.patterns.abstractFactory.romania.ingredients.FrozenClams;
import sample.design.patterns.abstractFactory.romania.ingredients.MozzarellaCheese;
import sample.design.patterns.abstractFactory.romania.ingredients.PlumTomatoSauce;
import sample.design.patterns.abstractFactory.romania.ingredients.ThickCrustDougd;

import static org.fest.assertions.Assertions.assertThat;

public class RomaniaPizzaStoreTest {
    private PizzaStore pizzaStore;
    private Pizza pizza;

    @Before
    public void setUp () {
         pizzaStore = new RomanianPizzaStore();
    }

    @Test
    public void testCreateRomanianStyleCheesePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.CHEESE);
        assertThat(pizza).isInstanceOf(RomanianStyleCheesePizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(MozzarellaCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(PlumTomatoSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThickCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).isNull();
    }

    @Test
    public void testCreateRomanianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.VEGGIE);
        assertThat(pizza).isInstanceOf(RomanianStyleVeggiePizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(MozzarellaCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(PlumTomatoSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThickCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).hasSize(3);
    }

    @Test
    public void testCreateRomanianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.CLAM);
        assertThat(pizza).isInstanceOf(RomanianStyleClamPizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(MozzarellaCheese.class);
        assertThat(pizza.getClams()).isInstanceOf(FrozenClams.class);
        assertThat(pizza.getSauce()).isInstanceOf(PlumTomatoSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThickCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).isNull();
    }

    @Test
    public void testCreateRomanianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.PEPPERONI);
        assertThat(pizza).isInstanceOf(RomanianStylePepperoniPizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(MozzarellaCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(PlumTomatoSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThickCrustDougd.class);
        assertThat(pizza.getPepperoni()).isInstanceOf(SlicedPepperoni.class);
        assertThat(pizza.getVeggies()).isNull();
    }
}
