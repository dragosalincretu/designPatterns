package sample.design.patterns.factoryMethod.common;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import sample.design.patterns.factoryMethod.romania.RomanianPizzaStore;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class OrderPizzaTest {
    private PizzaStore pizzaStore;

    @Mock
    private PizzaStoreBakery pizzaStoreBakery;

    @Mock
    private Pizza pizza;

    @Before
    public void setUp() {
        pizzaStore = new RomanianPizzaStore();
        pizzaStore.setPizzaStoreBakery(pizzaStoreBakery);
        Mockito.when(pizzaStoreBakery.createPizza(any(PizzaType.class))).thenReturn(pizza);
    }

    @Test
    public void testStoreCreateOrder () {
        pizzaStore.orderPizza(PizzaType.BACON);

        verify(pizzaStoreBakery).createPizza(PizzaType.BACON);

        verify(pizza).prepare();
        verify(pizza).bake();
        verify(pizza).cut();
        verify(pizza).box();
    }
}
