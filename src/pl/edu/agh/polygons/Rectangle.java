package pl.edu.agh.polygons;

public class Rectangle extends Polygon {

    public Rectangle(int sideA, int sideB) {
        super(new double[] {sideA, sideB, sideA, sideB});
    }

    public double area() {
        return sides[0] * sides[1];
    }
}
