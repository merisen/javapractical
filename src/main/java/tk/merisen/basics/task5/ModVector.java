package tk.merisen.basics.task5;

public class ModVector {
    private final double[] values;

    public ModVector(double[] values) {
        this.values = values;
    }

    public double length() {
        double sum = 0;
        for (double value : values) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }

    public double scalarProduct(ModVector vector) {
        double res = 0;
        for (int i = 0; i < values.length; i++) {
            res += values[i] * vector.values[i];
        }
        return res;
    }

    public double cos(ModVector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    public ModVector add(ModVector vector) {
        double[] another = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] + vector.values[i];
        }
        return new ModVector(another);
    }

    public ModVector subtract(ModVector vector) {
        double[] another = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            another[i] = values[i] - vector.values[i];
        }
        return new ModVector(another);
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static ModVector[] generate(int n, int dimension) {
        ModVector[] vectors = new ModVector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new ModVector(generateRandomArray(dimension));
        }
        return vectors;
    }
}
