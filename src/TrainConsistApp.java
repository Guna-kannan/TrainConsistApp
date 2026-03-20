import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("UC3 Track Unique Bogie IDs");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("86104");
        bogieIds.add("B6103");
        bogieIds.add("B6102");
        bogieIds.add("BG101");
        bogieIds.add("B6103"); // duplicate
        bogieIds.add("BG101"); // duplicate

        // Display bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        // Note message
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("UC3 uniqueness validation completed...");
    }
}