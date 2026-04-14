import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using Arrays.sort()
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
