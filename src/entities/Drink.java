package entities;

public class Drink {

    private String drinkName;
    // in ounces
    private long drinkVolumeOzs;

    // alcohol percent
    private long alcoholContentPercent;

    private long gramsOfAlcoholPerDrink;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public long getDrinkVolumeOzs() {
        return drinkVolumeOzs;
    }

    public void setDrinkVolumeOzs(long drinkVolumeOzs) {
        this.drinkVolumeOzs = drinkVolumeOzs;
    }

    public long getAlcoholContentPercent() {
        return alcoholContentPercent;
    }

    public void setAlcoholContentPercent(long alcoholContentPercent) {
        this.alcoholContentPercent = alcoholContentPercent;
    }

    //TODO DO THIS
    public long getGramsOfAlcoholPerDrink() {
        return gramsOfAlcoholPerDrink;
    }

    //TODO OR THIS!!!!
    public void setGramsOfAlcoholPerDrink(long gramsOfAlcoholPerDrink) {
        this.gramsOfAlcoholPerDrink = gramsOfAlcoholPerDrink;
    }




}
