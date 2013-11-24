package sample.design.patterns.factoryMethod.belgium;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

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
        assertThat(pizza.getName()).isEqualTo("Belgian Style Sauce and Vegetarian Pizza");
        assertThat(pizza.getDough()).isEqualTo("Thin Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Mariana Sauce");
        assertThat(pizza.getToppings()).hasSize(6);
        assertThat(pizza.getToppings()).contains(ToppingType.CORN);
        assertThat(pizza.getToppings()).contains(ToppingType.OLIVES);
        assertThat(pizza.getToppings()).contains(ToppingType.ONIONS);
        assertThat(pizza.getToppings()).contains(ToppingType.GREEN_PEPER);
        assertThat(pizza.getToppings()).contains(ToppingType.RED_PEPER);
        assertThat(pizza.getToppings()).contains(ToppingType.ANANAS);
    }

    @Test
    public void test_BelgianQuattroFormaggiPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(BelgianQuattroFormaggiPizza.class);
        assertThat(pizza.getName()).isEqualTo("Belgian Style Sauce and Quattro Formaggi Pizza");
        assertThat(pizza.getDough()).isEqualTo("Thin Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Mariana Sauce");
        assertThat(pizza.getToppings()).hasSize(4);
        assertThat(pizza.getToppings()).contains(ToppingType.GRUYERE_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.MOTZARELLA_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.CEDAR_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.PARMESAN_CHEESE);
    }

    @Test
    public void test_BelgianQuattroStagioniPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(BelgianQuattroStagioniPizza.class);
        assertThat(pizza.getName()).isEqualTo("Belgian Style Sauce and Quattro Stagioni Pizza");
        assertThat(pizza.getDough()).isEqualTo("Thin Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Mariana Sauce");
        assertThat(pizza.getToppings()).hasSize(4);
        assertThat(pizza.getToppings()).contains(ToppingType.BACON);
        assertThat(pizza.getToppings()).contains(ToppingType.OLIVES);
        assertThat(pizza.getToppings()).contains(ToppingType.MUSHROOMS);
        assertThat(pizza.getToppings()).contains(ToppingType.MOTZARELLA_CHEESE);
    }

    @Test
    public void test_BelgianBaconPizza(){
        pizza = belgianPizzaStore.orderPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(BelgianBaconPizza.class);
        assertThat(pizza.getName()).isEqualTo("Belgian Style Sauce and Bacon Pizza");
        assertThat(pizza.getDough()).isEqualTo("Thin Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Mariana Sauce");
        assertThat(pizza.getToppings()).hasSize(1);
        assertThat(pizza.getToppings()).contains(ToppingType.BACON);
    }
}
