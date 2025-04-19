public class MyRunnable implements Runnable {

    private final int sec;

    public MyRunnable(int sec) {
        this.sec = sec;
    }

    @Override
    public void run() {
        for (int i = 0; i <= this.sec; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i == this.sec) {
                System.out.printf("Time is up in %d seconds.\n", sec);
                System.exit(0);
            }
        }
    }
}
