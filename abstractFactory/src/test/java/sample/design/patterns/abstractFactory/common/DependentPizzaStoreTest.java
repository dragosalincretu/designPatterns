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
        pizza = pizzaStore.createPizza(PizzaStyle.BELGIAN, PizzaType.CHEESE);
        assertThat(pizza).isInstanceOf(BelgianStyleCheesePizza.class);
    }

    @Test
    public void testCreateBelgianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.BELGIAN, PizzaType.VEGGIE);
        assertThat(pizza).isInstanceOf(BelgianStyleVeggiePizza.class);
    }

    @Test
    public void testCreateBelgianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.BELGIAN, PizzaType.CLAM);
        assertThat(pizza).isInstanceOf(BelgianStyleClamPizza.class);
    }

    @Test
    public void testCreateBelgianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.BELGIAN, PizzaType.PEPPERONI);
        assertThat(pizza).isInstanceOf(BelgianStylePepperoniPizza.class);
    }

    @Test
    public void testCreateRomanianStyleCheesePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.ROMANIAN, PizzaType.CHEESE);
        assertThat(pizza).isInstanceOf(RomanianStyleCheesePizza.class);
    }

    @Test
    public void testCreateRomanianStyleVeggiePizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.ROMANIAN, PizzaType.VEGGIE);
        assertThat(pizza).isInstanceOf(RomanianStyleVeggiePizza.class);
    }

    @Test
    public void testCreateRomanianStyleClamPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.ROMANIAN, PizzaType.CLAM);
        assertThat(pizza).isInstanceOf(RomanianStyleClamPizza.class);
    }

    @Test
    public void testCreateRomanianStylePepperoniPizza() throws Exception {
        pizza = pizzaStore.createPizza(PizzaStyle.ROMANIAN, PizzaType.PEPPERONI);
        assertThat(pizza).isInstanceOf(RomanianStylePepperoniPizza.class);
    }
}
