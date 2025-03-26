import java.util.Random;
import java.util.Scanner;

public class janKenPon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] actions = {"✊", "\uD83E\uDD1A", "✌️"};
        int choice;
        int computerMove;
        boolean gameContinue = true;
        int youWin = 0;
        int computerWin = 0;
        String isContinued;

        System.out.println("じゃんけんぽん");
        do {
            System.out.print("1.✊ 2.\uD83E\uDD1A 3.✌️　から一つ選んで :");
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
                youWin += 1;
            } else {
                System.out.println("パソコンの勝利");
                computerWin += 1;
            }

            if (youWin > 0) {
                System.out.print("続く? (Y/N): ");
                isContinued = scanner.nextLine().toUpperCase();

                if (isContinued.equals("Y")) {
                    continue;
                } else {
                    System.out.println("いい勝負だったよ！");
                    System.out.printf("あなたの得点: %d　パソコンの得点: %d\n", youWin, computerWin);
                }

            } else {
                System.out.println("人間ってこんなのレベルか・・・");
            }

            gameContinue = false;


        } while (gameContinue);

    }
}
