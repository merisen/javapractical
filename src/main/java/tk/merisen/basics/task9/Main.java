package tk.merisen.basics.task9;

/**
 * Temperature converter
 * <p>
 * Write a BaseConverter class to convert from Celsius degrees to
 * Kelvin, Fahrenheit, and so on. The method should have a convert method which
 * and does the conversion.
 */

interface Converter {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("Celsius t = " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("Kelvin t = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("Fahrenheit t = " + new FahrenheitConverter().getConvertedValue(temperature));
    }
}
