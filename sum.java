import java.util.ArrayList;

public class sum {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add names
        students.add("Amit");
        students.add("Junior");
        students.add("Riya");
        students.add("Junior");
        students.add("Rahul");

        System.out.println("Before Promotion: " + students);

        // Indexed for loop
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals("Junior")) {
                students.set(i, "Senior");   // Replace Junior with Senior
            }
        }

        System.out.println("After Promotion: " + students);
    }
}
