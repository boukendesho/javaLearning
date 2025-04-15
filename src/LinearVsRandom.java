import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.function.Supplier;

public class LinearVsRandom {
    public static void main(String[] args) {
        int lengthOfList = 100;
        ArrayList<Integer> randomNumbers = genRandomNumbers(lengthOfList);
        // int count = linearSearch(randomNumbers);
        // int count = randomSearch(randomNumbers);
        ArrayList<Integer> linearResults;
        ArrayList<Integer> randomResults;

        linearResults = repeat(100, () -> linearSearch(randomNumbers));
        randomResults = repeat(100, () -> randomSearch(randomNumbers));

        System.out.printf("長さ%dの配列、線形探索%d回の平均値：%.2f\n", lengthOfList, linearResults.size(), average(linearResults));
        System.out.printf("長さ%dの配列、ランダム探索%d回の平均値：%.2f\n", lengthOfList, randomResults.size(), average(randomResults));


    }

    private static ArrayList<Integer> genRandomNumbers(int count) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            randomNumbers.add(i);
        }

        Collections.shuffle(randomNumbers);
        return randomNumbers;
    }

    private static int linearSearch(ArrayList<Integer> randomNumbers) {
        Random random = new Random();
        int chosenNumber = random.nextInt(0, randomNumbers.size());

        for (int randomNumber : randomNumbers) {
            if (randomNumber == chosenNumber) {
                break;
            }
        }

//        System.out.println(chosenNumber);
//        System.out.printf("線形探索 探した回数： %s\n", randomNumbers.indexOf(chosenNumber) + 1);

        return randomNumbers.indexOf(chosenNumber) + 1;
    }

    private static int randomSearch(ArrayList<Integer> randomNumbers) {
        Random random = new Random();
        int chosenNumber = random.nextInt(0, randomNumbers.size());
        int counter = 0;

        while (true) {
            int randomIndex = random.nextInt(0, randomNumbers.size());

            counter += 1;
            if (randomNumbers.get(randomIndex) == chosenNumber) {
                break;
            }
        }


//        System.out.println(chosenNumber);
//        System.out.printf("ランダム探索 探した回数： %s\n", counter);

        return counter;
    }

    private static double average(ArrayList<Integer> arrayList) {
        int sum = 0;
        if (arrayList.isEmpty()) {
            return 0;
        } else {
            for (int number : arrayList) {
                sum += number;
            }
        }

        return (double) sum / arrayList.size();
    }

    private static ArrayList<Integer> repeat(int count, Supplier<Integer> runnable) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            results.add(runnable.get());
        }

        return results;
    }
}
