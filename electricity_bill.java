public class electricity_bill {
    electricity_bill(int unit) {
        int rem, remind;
        if (unit <= 100) {
            System.out.println("electricity bill=" + (unit * 5));
        } else if (unit <= 200) {
            rem = unit - 100;
            System.out.println("electricity bill=" + ((100 * 5) + (rem * 7)));
        } else {
            remind = unit - 200;
            System.out.println("electricity bill=" + ((100 * 5) + (100 * 7) + (remind * 10)));
        }

    }

    public static void main(String[] args) {

        electricity_bill e = new electricity_bill(240);
    }
}