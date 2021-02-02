package tk.merisen.basics.task6;

import org.jetbrains.annotations.NotNull;

/**
 * Generating a random element with a weight
 * <p>
 * Write a class whose constructor takes two arrays: an array of values and an array of weights of values.
 * The class should contain a method that will randomly return an element from the first array,
 * taking into account its weight.
 * Example:
 * Given an array [1, 2, 3], and an array of weights [1, 2, 10].
 * On average, the value "1" should be returned 2 times less frequently than the value "2"
 * and ten times less often than the value "3".
 */

class RandomFromArray {
    private final int[] extendedValues;

    public RandomFromArray(int[] values, @NotNull int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        extendedValues = new int[sum];
        int cursor = 0;
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                extendedValues[cursor++] = values[i];
            }
        }
    }

    public int getRandom() {
        int random = (int) (Math.random() * (extendedValues.length - 1));
        return extendedValues[random];
    }
}