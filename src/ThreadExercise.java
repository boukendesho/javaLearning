import java.util.Scanner;

public class ThreadExercise {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(5);
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input something(Tik tok in background): ");
        String usrInput = scanner.nextLine();
        System.out.println(usrInput);

        scanner.close();
    }
}
