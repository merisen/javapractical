package tk.merisen.basics.task5;

/**
 * Designing and creating a class that describes a vector
 * <p>
 * Create a class that describes the vector (in 3D space).
 * <p>
 * He must have:
 * constructor with parameters in the form of a list of coordinates x, y, z
 * a method that calculates the length of a vector. The root can be calculated using Math.sqrt ():
 * <p>
 * dot product method:
 * <p>
 * a method that calculates the cross product with a different vector:
 * <p>
 * a method that calculates the angle between vectors (or cosine of an angle):
 * the cosine of an angle between vectors is equal to the dot product of vectors divided by the product of moduli (lengths) of vectors:
 * <p>
 * methods for sum and difference:
 * static method that takes an integer N and returns an array of random vectors of size N.
 * <p>
 * If the method returns a vector, then it should return a new object, and not change the base one.
 * That is, you need to implement the "Immutable Object" pattern.
 */

public class Main {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}
