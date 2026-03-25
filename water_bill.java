import java.util.Scanner;

public class water_bill {
    water_bill() {
        int rem, remind;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit of water");
        int unit = sc.nextInt();
        if (unit <= 50) {
            System.out.println("water bill=" + (unit * 2));
        } else if (unit <= 100) {
            rem = unit - 50;
            System.out.println("water bill=" + ((50 * 2) + (rem * 5)));
        } else {
            remind = unit - 100;
            System.out.println("water bill=" + ((50 * 2) + (50 * 5) + (remind * 8)));
        }

    }

    public static void main(String[] args) {
        water_bill obj = new water_bill();
    }
}