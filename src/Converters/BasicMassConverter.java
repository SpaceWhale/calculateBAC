package Converters;
import constants.MassConstants;


public class PoundKilogramConverter {

    public float convertPoundToKilogram(float Pound) {
        return (Pound / MassConstants.kilogramInPounds);
    }

    public float convertKilogramToPound(float Kilogram) {
        return (Kilogram * MassConstants.kilogramInPounds);
    }
}
