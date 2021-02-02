package tk.merisen.basics.task1;

/**
 * Maximum, minimum and average value task with enhanced for
 * <p>
 * Fill the array with random numbers and print the maximum, minimum and average values.
 * To generate a random number, use the Math.random () method, which returns a value in the range [0, 1].
 * <p>
 * Result(always random):
 * max = 0.9850193093358337
 * min = 0.012661579587181726
 * avg = 0.5307974453204826
 */

public class MainMod {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (double v : array) {
            if (max < v) max = v;
            if (min > v) min = v;
            avg += v / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
