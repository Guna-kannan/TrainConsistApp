import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Display header
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initialization messages
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        // Ready message
        System.out.println("\nSystem ready for operations...");
    }
}