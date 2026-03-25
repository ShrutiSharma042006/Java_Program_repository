
public class CabRide {
    CabRide(int distance) {
        int rem;
        if (distance < 5) {
            // System.out.println(distance*50);
            System.out.println("the amount  is " + (distance * 50));
        } else {
            rem = distance - 5;
            System.out.println("teh amount is " + ((5 * 50) + (rem * 30)));
        }
    }

    public static void main(String[] args) {
        CabRide c = new CabRide(3);

    }
}