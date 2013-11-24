package sample.design.patterns.factoryMethod.romania;

import org.junit.Before;
import org.junit.Test;
import sample.design.patterns.factoryMethod.common.Pizza;
import sample.design.patterns.factoryMethod.common.PizzaStore;
import sample.design.patterns.factoryMethod.common.PizzaType;
import sample.design.patterns.factoryMethod.common.ToppingType;

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
        assertThat(pizza.getName()).isEqualTo("Romanian Style Sauce and Vegetarian Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).hasSize(6);
        assertThat(pizza.getToppings()).contains(ToppingType.CORN);
        assertThat(pizza.getToppings()).contains(ToppingType.OLIVES);
        assertThat(pizza.getToppings()).contains(ToppingType.ONIONS);
        assertThat(pizza.getToppings()).contains(ToppingType.GREEN_PEPER);
        assertThat(pizza.getToppings()).contains(ToppingType.RED_PEPER);
        assertThat(pizza.getToppings()).contains(ToppingType.ANANAS);
    }

    @Test
    public void test_RomanianQuattroFormaggiPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.QUATTRO_FORMAGGI);
        assertThat(pizza).isInstanceOf(RomanianQuattroFormaggiPizza.class);
        assertThat(pizza.getName()).isEqualTo("Romanian Style Sauce and Quattro Formaggi Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).hasSize(4);
        assertThat(pizza.getToppings()).contains(ToppingType.GRUYERE_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.MOTZARELLA_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.CEDAR_CHEESE);
        assertThat(pizza.getToppings()).contains(ToppingType.PARMESAN_CHEESE);
    }

    @Test
    public void test_RomanianQuattroStagioniPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.QUATTRO_STAGIONI);
        assertThat(pizza).isInstanceOf(RomanianQuattroStagioniPizza.class);
        assertThat(pizza.getName()).isEqualTo("Romanian Style Sauce and Quattro Stagioni Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).hasSize(4);
        assertThat(pizza.getToppings()).contains(ToppingType.BACON);
        assertThat(pizza.getToppings()).contains(ToppingType.OLIVES);
        assertThat(pizza.getToppings()).contains(ToppingType.MUSHROOMS);
        assertThat(pizza.getToppings()).contains(ToppingType.MOTZARELLA_CHEESE);
    }

    @Test
    public void test_RomanianBaconPizza(){
        pizza = romanianPizzaStore.orderPizza(PizzaType.BACON);
        assertThat(pizza).isInstanceOf(RomanianBaconPizza.class);
        assertThat(pizza.getName()).isEqualTo("Romanian Style Sauce and Bacon Pizza");
        assertThat(pizza.getDough()).isEqualTo("Extra Thick Crust Dough");
        assertThat(pizza.getSauce()).isEqualTo("Plum Tomato Sauce");
        assertThat(pizza.getToppings()).hasSize(1);
        assertThat(pizza.getToppings()).contains(ToppingType.BACON);
    }
}
