class test {
    static int x = 0;

    test() {
        x++;
        System.out.println(x + " ");
    }
}

public class main {
    public static void main(String[] args) {
        new test();
        new test();
        new test();
    }
}