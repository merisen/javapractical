package tk.merisen.basics.task8;

import java.util.ArrayList;

/**
 * Implement a class hierarchy describing 3D shapes
 * <p>
 * The Box class is a container; it can contain other shapes.
 * The add () method takes Shape as input. We need to add new shapes as long as we have enough space for
 * them in the Box (we will only count the volume, ignoring the shape. Let's say we are pouring liquid).
 * If there is not enough space to add a new shape, then the method should return false.
 */

class Shape {
    private final double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private final double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}

class Cylinder extends SolidOfRevolution {
    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
    }
}

class Pyramid extends Shape {
    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
    }
}

class Box extends Shape {
    private final ArrayList<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
