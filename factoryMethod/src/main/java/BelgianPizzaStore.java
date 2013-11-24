/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:19 AM
 */
public class BelgianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case VEGETARIAN:
                return new BelgianVegetarianPizza(pizzaType);
            case QUATTRO_STAGIONI:
                return new BelgianQuattroStagioniPizza(pizzaType);
            case QUATTRO_FORMAGGI:
                return new BelgianQuattroFormaggiPizza(pizzaType);
            case BACON:
                return new BelgianBaconPizza(pizzaType);
        }
        return null;
    }
}
