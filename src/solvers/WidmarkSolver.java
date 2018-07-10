package solvers;

import entities.Drink;
import entities.DrinkingSession;

import java.util.ListIterator;

public class WidmarkSolver {
    private float totalGramsAlcoholConsumed = 0f;
    /**
     * Solves for estimated blood alochol content.
     * @param drinkingSession
     * @return
     */
    public String bloodAlcoholContent(DrinkingSession drinkingSession) {
        for (ListIterator<Drink> drinkListIterator = drinkingSession.getDrinks().listIterator(); drinkListIterator.hasNext(); ) {
            Drink drink = drinkListIterator.next();
            try {
                totalGramsAlcoholConsumed = totalGramsAlcoholConsumed + drink.getGramsOfAlcoholPerDrink();
            } catch (NullPointerException e) {
                System.out.println("Grams of alcohol undefined. " + e);
            }

        }


        return null;
    }
}
