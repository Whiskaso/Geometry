package pl.edu.agh.polygons;

public class Triangle extends Polygon {

    public Triangle(int sideA, int sideB, int sideC) {
        super(new double[] {sideA, sideB, sideC});
    }

    @Override
    double area() {
        if((sides[0]+sides[1])>sides[2] && (sides[0]+sides[2])>sides[1] && (sides[1]+sides[2])>sides[0])
        {
            double s;
            s = (sides[0]+sides[1]+sides[2])/2;
            return Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
        }
        else
            throw new ArithmeticException("Cant calc");
    }
}
