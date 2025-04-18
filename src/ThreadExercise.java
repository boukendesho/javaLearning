public class ThreadExercise implements Runnable {
    public static void main(String[] args) {
        System.out.println("This running in a thread");
    }

    @Override
    public void run() {
        System.out.println("This running in a thread");
    }
}
