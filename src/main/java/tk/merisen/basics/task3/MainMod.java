package tk.merisen.basics.task3;

/**
 * Finding prime numbers with enhanced for
 * Write a program that prints prime numbers between [2, 100] to the console.
 * Use the% (modulo) operator and loops to accomplish this task.
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

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
