package pl.edu.agh.polygons;

public class Geometry {
    public static void main(String[] args) {
        Square square = new Square(13);
        System.out.println(square.perimeter());
        System.out.println(square.area());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        Triangle triangle = new Triangle (5, 5 ,5);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());

        Triangle triangle2 = new Triangle (32, 54 ,34);
        System.out.println(triangle2.perimeter());
        System.out.println(triangle2.area());
    }
}
