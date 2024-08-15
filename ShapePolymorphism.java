// Abstract class Shape
abstract class Shape {
    // Abstract method numberOfSides
    abstract int numberOfSides();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    // Implementing numberOfSides method
    int numberOfSides() {
        return 4;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    // Implementing numberOfSides method
    int numberOfSides() {
        return 3;
    }
}

// Hexagon class extending Shape
class Hexagon extends Shape {
    // Implementing numberOfSides method
    int numberOfSides() {
        return 6;
    }
}

// Main class to test the implementation
public class ShapePolymorphism {
    public static void main(String[] args) {
        // Create objects of Rectangle, Triangle, and Hexagon
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Print the number of sides
        System.out.println("Rectangle has " + rectangle.numberOfSides() + " sides.");
        System.out.println("Triangle has " + triangle.numberOfSides() + " sides.");
        System.out.println("Hexagon has " + hexagon.numberOfSides() + " sides.");
    }
}
