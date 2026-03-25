// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class test {
    int x;
    String name;

    test() {
        x = 100;
        name = "shruti";
    }

    void setData(int i, String n) {
        x = i;
        name = n;
    }
}

class ans {
    public static void main(String[] args) {
        test obj = new test();
        obj.setData(101, "pratibha");
        System.out.println(obj.x);
        System.out.println(obj.name);
    }
}
