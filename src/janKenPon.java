import java.util.Random;
import java.util.Scanner;

public class janKenPon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] actions = {"グー", "パー", "チョキ"};
        int choice;
        int computerMove;
        boolean gameContinue = true;

        System.out.println("じゃんけんぽん");
        do {
            System.out.print("1.グー 2.パー 3.チョキ　から一つ選んで :");
            choice = scanner.nextInt() - 1;

            computerMove = random.nextInt(actions.length);

            System.out.printf("あなた: %s　パソコン: %s\n", actions[choice], actions[computerMove]);

            if (choice == computerMove) {
                System.out.println("あいこでしょ");
                continue;
            }

            if ((choice == 0 && computerMove == 2) || (choice == 1 && computerMove == 0) || (choice == 2 && computerMove == 1)) {
                System.out.println("あなたの勝利");
            } else {
                System.out.println("パソコンの勝利");
            }

            gameContinue = false;

        } while (gameContinue);

    }
}
