/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/20
 * Time: 1:16 AM
 */
public class RomanianPizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case VEGETARIAN:
                return new RomanianVegetarianPizza(pizzaType);
            case QUATTRO_STAGIONI:
                return new RomanianQuattroStagioniPizza(pizzaType);
            case QUATTRO_FORMAGGI:
                return new RomanianQuattroFormaggiPizza(pizzaType);
            case BACON:
                return new RomanianBaconPizza(pizzaType);
        }
        return null;
    }
}
