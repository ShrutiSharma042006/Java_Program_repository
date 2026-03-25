public class product {
    int pid;
    String pname;
    int price;

    void setData(int i, String n, int p) {
        pid = i;
        pname = n;
        price = p;

    }

    void display() {
        System.out.println("id=" + pid);
        System.out.println("name=" + pname);
        System.out.println("price=" + price);
    }

    public static void main(String[] args) {
        product p1, p2;
        p1 = new product();
        p2 = new product();
        p1.setData(1, "kukure", 20);
        p2.setData(2, "samosa", 10);
        p1.display();
        p2.display();
    }
}