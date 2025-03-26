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
        int score = 0;
        String isContinued;

        System.out.println("じゃんけんぽん");
        do {
            System.out.print("1.グー 2.パー 3.チョキ　から一つ選んで :");
            choice = scanner.nextInt() - 1;
            scanner.nextLine();

            computerMove = random.nextInt(actions.length);

            System.out.printf("あなた: %s　パソコン: %s\n", actions[choice], actions[computerMove]);

            if (choice == computerMove) {
                System.out.println("あいこでしょ");
                continue;
            }

            if ((choice == 0 && computerMove == 2) || (choice == 1 && computerMove == 0) || (choice == 2 && computerMove == 1)) {
                System.out.println("あなたの勝利");
                score += 1;
            } else {
                System.out.println("パソコンの勝利");
            }

            if (score > 0) {
                System.out.print("続く? (Y/N): ");
                isContinued = scanner.nextLine().toUpperCase();

                if (isContinued.equals("Y")) {
                    continue;
                } else {
                    System.out.println("いい勝負だったよ！");
                    System.out.printf("あなたの点数: %d\n", score);
                }

            }

            gameContinue = false;


        } while (gameContinue);

    }
}
