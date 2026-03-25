public class method_overloading {
    public static void main(String[] args) {

        demo d1 = new demo();
        d1.add(2, 4, 6);
        // System.out.println(sum + " ");

    }
}

class demo {
    void add(int a, int b) {
        System.out.println("sum =" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("sum =" + (a + b + c));
    }
}