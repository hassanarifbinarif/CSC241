import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Sessional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println("Press enter to stop the stopwatch");
        scanner.nextLine();
        stopWatch.stop();

        System.out.printf("Time elapsed: %d", stopWatch.getElapsedTime());
    }
}

class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch() {
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        return (int) Duration.between(startTime, endTime).toMillis();
    }

    public boolean equals(StopWatch obj) {
        return startTime.equals(obj.getStartTime()) && endTime.equals(obj.getEndTime());
    }
}
