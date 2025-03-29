import java.util.Scanner;

public class PlayWithArray {
    public static void main(String[] args) {
        // An Array with items
        String[] GPUBrands = {"NVIDIA", "AMD", "INTEL"};
        boolean noMatched = true;

        // User input
        String choice;
        System.out.print("Which brand of GPU you want?: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine().toUpperCase();

        for (String gpu : GPUBrands) {
            // Check if user's input is matching items in Array
            if (choice.equals(gpu)) {
                System.out.printf("Ahh here is your %s GPU\n", gpu);
                noMatched = false;
                break;
            }
        }

        if (noMatched) {
            System.out.println("Can't find your favorite GPU Brand.");
        }
    }
}
