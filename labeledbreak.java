public class labeledbreak {
    public static void main(String[] args) {
        outer: for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 3) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }
    }

}
