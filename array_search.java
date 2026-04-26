import java.util.Scanner;

public class array_search {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50, 60 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            // int a = charAt(i);
            if (arr[i] == num) {
                System.out.println("found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }

    }

}
