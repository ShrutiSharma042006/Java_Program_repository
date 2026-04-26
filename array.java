import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("enter 5 numbers");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("------you entered------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("you enter invalid numbers");
                break;
            }

            if (arr[i] == 0) {
                continue;
            }

            System.out.println(arr[i]);
            sum = sum + arr[i];

        }
        System.out.println(" sum of all num is: " + sum);

    }

}
