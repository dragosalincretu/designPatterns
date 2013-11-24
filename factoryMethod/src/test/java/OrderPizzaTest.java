import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import sample.design.patterns.factoryMethod.belgium.*;
import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.romania.*;

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

    @Mock
    private Pizza mokedPizza;
    @Mock
    private RomanianPizzaStore mokedPizzaStore;

    @Before
    public void setUp(){
        romanianPizzaStore = new RomanianPizzaStore();
        belgianPizzaStore = new BelgianPizzaStore();
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
