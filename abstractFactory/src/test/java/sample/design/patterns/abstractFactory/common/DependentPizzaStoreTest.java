package sample.design.patterns.abstractFactory.common;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.abstractFactory.belgium.BelgianStyleCheesePizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStyleClamPizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStylePepperoniPizza;
import sample.design.patterns.abstractFactory.belgium.BelgianStyleVeggiePizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleCheesePizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleClamPizza;
import sample.design.patterns.abstractFactory.romania.RomanianStylePepperoniPizza;
import sample.design.patterns.abstractFactory.romania.RomanianStyleVeggiePizza;

import static org.fest.assertions.Assertions.assertThat;

public class DependentPizzaStoreTest {
    private DependentPizzaStore pizzaStore;
    private Pizza pizza;

    @Before
    public void setUp () {
         pizzaStore = new DependentPizzaStore();
    }

    @Test
    public void testCreateBelgianStyleCheesePizza() throws Exception {
        pizza = pizzaStore.createPizza("Belgium", "cheese");
        assertThat(pizza).isInstanceOf(BelgianStyleCheesePizza.class);
    }

    @Test
    public void testCreateBelgianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza("Belgium", "veggie");
        assertThat(pizza).isInstanceOf(BelgianStyleVeggiePizza.class);
    }

    @Test
    public void testCreateBelgianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza("Belgium", "clam");
        assertThat(pizza).isInstanceOf(BelgianStyleClamPizza.class);
    }

    @Test
    public void testCreateBelgianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza("Belgium", "pepperoni");
        assertThat(pizza).isInstanceOf(BelgianStylePepperoniPizza.class);
    }

    @Test
    public void testCreateRomanianStyleCheesePizza() throws Exception {
        pizza = pizzaStore.createPizza("Romania", "cheese");
        assertThat(pizza).isInstanceOf(RomanianStyleCheesePizza.class);
    }

    @Test
    public void testCreateRomanianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza("Romania", "veggie");
        assertThat(pizza).isInstanceOf(RomanianStyleVeggiePizza.class);
    }

    @Test
    public void testCreateRomanianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza("Romania", "clam");
        assertThat(pizza).isInstanceOf(RomanianStyleClamPizza.class);
    }

    @Test
    public void testCreateRomanianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza("Romania", "pepperoni");
        assertThat(pizza).isInstanceOf(RomanianStylePepperoniPizza.class);
    }
}
