import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class linearVsRandom {
    public static void main(String[] args) {
        System.out.println(genRandomNumbers(100));

    }

    static ArrayList<Integer> genRandomNumbers(int count) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            randomNumbers.add(i);
        }

        Collections.shuffle(randomNumbers);
        return randomNumbers;
    }
}
