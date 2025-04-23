import java.util.Timer;
import java.util.TimerTask;

public class TimerExercise {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello from timer task!");
            }
        };

        // timer.schedule(task, delay, period)
        timer.schedule(timerTask, 0, 1000);


    }
}
