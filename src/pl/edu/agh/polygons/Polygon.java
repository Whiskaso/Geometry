package pl.edu.agh.polygons;

public abstract class Polygon {

    protected double[] sides;

    public Polygon(double[] sides) {
        this.sides = sides;
    }

    public int perimeter(){
        int sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    };

    abstract double area();
}
