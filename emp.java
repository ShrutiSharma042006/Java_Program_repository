public class emp {
    int id;
    String name;

    void setData(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("id is" + id);
        System.out.println("name is" + name);
    }

    public static void main(String[] args) {

        emp e1, e2;
        e1 = new emp();
        e1.setData(101, "shruti");
        e2 = new emp();
        e2.setData(102, "pratibha");
        e1.display();
        e2.display();
    }
}
