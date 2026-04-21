import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char ch;
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            ch = name.charAt(i);
            rev = rev + ch;
        }
        System.out.print(rev);
    }

}
