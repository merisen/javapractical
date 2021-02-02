package tk.merisen.basics.task1;

/**
 * Maximum, minimum and average value task
 * <p>
 * Fill the array with random numbers and print the maximum, minimum and average values.
 * To generate a random number, use the Math.random () method, which returns a value in the range [0, 1].
 * <p>
 * Result(always random):
 * max = 0.9781890082057634
 * min = 0.008890534818589146
 * avg = 0.5055048352566711
 */

public class Main {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
