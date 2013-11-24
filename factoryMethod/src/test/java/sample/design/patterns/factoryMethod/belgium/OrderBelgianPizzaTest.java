package sample.design.patterns.factoryMethod.belgium;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;

import static org.fest.assertions.Assertions.assertThat;

public class OrderBelgianPizzaTest {
    private Pizza pizza;
    PizzaStore belgianPizzaStore;

    @Before
    public void setUp(){
        belgianPizzaStore = new BelgianPizzaStore();
    }

    @Test
    public void test_BelgianVegetarianPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.VEGETARIAN);
        assertThat(pizza).isInstanceOf(BelgianVegetarianPizza.class);
    }
    @Test
    public void test_BelgianQuattroFormaggiPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(BelgianQuattroFormaggiPizza.class);
    }

    @Test
    public void test_BelgianQuattroStagioniPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(BelgianQuattroStagioniPizza.class);
    }

    @Test
    public void test_BelgianBaconPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(BelgianBaconPizza.class);
    }
}
