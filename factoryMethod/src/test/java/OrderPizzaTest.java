import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:06 AM
 */
public class OrderPizzaTest {
    private Pizza pizza;
    PizzaStore belgianPizzaStore;
    PizzaStore romanianPizzaStore;

    @Before
    public void setUp(){
        romanianPizzaStore = new RomanianPizzaStore();
        belgianPizzaStore = new BelgianPizzaStore();
    }

    @Test
    public void test_RomanianVegetarianPizza(){
        pizza = romanianPizzaStore.createPizza(PizzaType.VEGETARIAN);
        assertThat(pizza).isInstanceOf(RomanianVegetarianPizza.class);
    }

    @Test
    public void test_RomanianQuattroFormaggiPizza(){
        pizza = romanianPizzaStore.createPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(RomanianQuattroFormaggiPizza.class);
    }

    @Test
    public void test_RomanianQuattroStagioniPizza(){
        pizza = romanianPizzaStore.createPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(RomanianQuattroStagioniPizza.class);
    }

    @Test
    public void test_RomanianBaconPizza(){
        pizza = romanianPizzaStore.createPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(RomanianBaconPizza.class);
    }

    @Test
    public void test_BelgianVegetarianPizza(){
        pizza = belgianPizzaStore.createPizza(PizzaType.VEGETARIAN);
        assertThat(pizza).isInstanceOf(BelgianVegetarianPizza.class);
    }
    @Test
    public void test_BelgianQuattroFormaggiPizza(){
        pizza = belgianPizzaStore.createPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(BelgianQuattroFormaggiPizza.class);
    }

    @Test
    public void test_BelgianQuattroStagioniPizza(){
        pizza = belgianPizzaStore.createPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(BelgianQuattroStagioniPizza.class);
    }

    @Test
    public void test_BelgianBaconPizza(){
        pizza = belgianPizzaStore.createPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(BelgianBaconPizza.class);
    }
}
