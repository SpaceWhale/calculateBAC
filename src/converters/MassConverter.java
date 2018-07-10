package converters;
import constants.MassConstants;


public class MassConverter {

    public float poundToKilogram(float pounds) {
        return (pounds / MassConstants.kilogramInPounds);
    }

    public float kilgramsToPound(float kilograms) {
        return (kilograms * MassConstants.kilogramInPounds);
    }

    public float poundsToGrams(float pounds) {
        return (kilogramToGram(poundToKilogram(pounds)));
    }

    public float kilogramToGram(float kilograms) {
        return (kilograms * 1000);
    }
}
