import java.util.Timer;
import java.util.TimerTask;

public class TimerExercise {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 5;

            @Override
            public void run() {
                System.out.println("Hello from timer task!");

                count--;
                if (count <= 0) {
                    timer.cancel();
                    System.out.println("Timeout! Canceled.");
                }
            }
        };

        // timer.schedule(task, delay, period)
        timer.schedule(timerTask, 0, 1000);


    }
}
