package tk.merisen.basics.task2;

/**
 * Implement a bubble sort algorithm to sort an array with enhanced for
 * <p>
 * Result: second.txt
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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (double v : array) {
            System.out.println(v);
        }
    }
}
