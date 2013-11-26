package sample.design.patterns.abstractFactory.belgium;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.abstractFactory.belgium.ingredients.FreshClams;
import sample.design.patterns.abstractFactory.belgium.ingredients.MarianaSauce;
import sample.design.patterns.abstractFactory.belgium.ingredients.ReggianoCheese;
import sample.design.patterns.abstractFactory.belgium.ingredients.ThinCrustDougd;
import sample.design.patterns.abstractFactory.common.Pizza;
import sample.design.patterns.abstractFactory.common.PizzaStore;
import sample.design.patterns.abstractFactory.common.PizzaType;
import sample.design.patterns.abstractFactory.common.ingredients.SlicedPepperoni;

import static org.fest.assertions.Assertions.assertThat;

public class BelgianPizzaStoreTest {
    private PizzaStore pizzaStore;
    private Pizza pizza;

    @Before
    public void setUp () {
         pizzaStore = new BelgianPizzaStore();
    }

    @Test
    public void testCreateBelgianStyleCheesePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.CHEESE);
        assertThat(pizza).isInstanceOf(BelgianStyleCheesePizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(ReggianoCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(MarianaSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThinCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).isNull();
    }

    @Test
    public void testCreateBelgianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.VEGGIE);
        assertThat(pizza).isInstanceOf(BelgianStyleVeggiePizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(ReggianoCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(MarianaSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThinCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).hasSize(4);
    }

    @Test
    public void testCreateBelgianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.CLAM);
        assertThat(pizza).isInstanceOf(BelgianStyleClamPizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(ReggianoCheese.class);
        assertThat(pizza.getClams()).isInstanceOf(FreshClams.class);
        assertThat(pizza.getSauce()).isInstanceOf(MarianaSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThinCrustDougd.class);
        assertThat(pizza.getPepperoni()).isNull();
        assertThat(pizza.getVeggies()).isNull();
    }

    @Test
    public void testCreateBelgianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaType.PEPPERONI);
        assertThat(pizza).isInstanceOf(BelgianStylePepperoniPizza.class);
        assertThat(pizza.getCheese()).isInstanceOf(ReggianoCheese.class);
        assertThat(pizza.getClams()).isNull();
        assertThat(pizza.getSauce()).isInstanceOf(MarianaSauce.class);
        assertThat(pizza.getDough()).isInstanceOf(ThinCrustDougd.class);
        assertThat(pizza.getPepperoni()).isInstanceOf(SlicedPepperoni.class);
        assertThat(pizza.getVeggies()).isNull();
    }
}
