package sample.design.patterns.factoryMethod.romania;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;

import static org.fest.assertions.Assertions.assertThat;

public class OrderRomanianPizzaTest {
    private Pizza pizza;
    PizzaStore romanianPizzaStore;

    @Before
    public void setUp(){
        romanianPizzaStore = new RomanianPizzaStore();
    }

    @Test
    public void test_RomanianVegetarianPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.VEGETARIAN);
        assertThat(pizza).isInstanceOf(RomanianVegetarianPizza.class);
    }

    @Test
    public void test_RomanianQuattroFormaggiPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(RomanianQuattroFormaggiPizza.class);
    }

    @Test
    public void test_RomanianQuattroStagioniPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(RomanianQuattroStagioniPizza.class);
    }

    @Test
    public void test_RomanianBaconPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(RomanianBaconPizza.class);
    }
}
