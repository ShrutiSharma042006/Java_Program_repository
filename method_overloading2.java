public class method_overloading2 {
    public static void main(String[] args) {
        area(30);

    }

    static void area(int r) {
        System.out.println("Area of circle is " + (3.14 * r * r));
    }

    static void area(int b, int h) {
        System.out.println("Area of triangle is " + (0.5 * b * h));
    }

    static void area(double l, double b) {
        System.out.println("Area of rectangle is " + (l * b));
    }
}