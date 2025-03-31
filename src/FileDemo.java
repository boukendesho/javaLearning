import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        final String filePath = "~/test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Program exit.");
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }


    }
}
