package entities;

import java.util.List;

public class DrinkingSession {

    private DrinkingSession() {
    }

    private float drinkingDurationHours;
    private List<Drink> drinks;
    private Drinker drinker;

    public Drinker getDrinker() {
        return drinker;
    }

    public void setDrinker(Drinker drinker) {
        this.drinker = drinker;
    }

    public float getDrinkingDuration() {
        return drinkingDurationHours;
    }

    public void setDrinkingDuration(float drinkingDuration) {
        this.drinkingDurationHours = drinkingDuration;
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public List<Drink> getDrinks() {
        return this.drinks;
    }
}
