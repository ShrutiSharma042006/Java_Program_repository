public class method_overloading2 {
    public static void main(String[] args) {
        area();
    }

    static void area(int r) {
        System.out.println("area of circle is " + (3.14 * r * r));
    }

    static void area(int b, int h) {
        System.out.println("area of triangle is " + (0.5 * b * h));
    }

    static void area(int l, int b) {
        System.out.println("area of rectangle is " + (l * b));
    }
}