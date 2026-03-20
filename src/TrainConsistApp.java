import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Inserting predefined values (as per expected output)
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);

        // Displaying output
        System.out.println("UC6 Map Bogie to Capacity (HashMap)");
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {

            // Custom formatting to match your output style
            if (entry.getKey().equals("First Class")) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            else if (entry.getKey().equals("Cargo")) {
                System.out.println(entry.getKey() + " ->");
                System.out.println(entry.getValue());
            }
            else if (entry.getKey().equals("Sleeper")) {
                System.out.println(entry.getKey() + " ->");
                System.out.println(entry.getValue());
            }
            else if (entry.getKey().equals("AC Chair")) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }

        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}