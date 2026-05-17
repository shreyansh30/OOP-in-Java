import java.util.Scanner;

class CounterThread extends Thread {
    private final int lowerRange;
    private final int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.println("Thread - " + Thread.currentThread().getName() + " Counter - " + i);
            try {
                Thread.sleep(5); // sleep for 5 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class multithreading1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name of the thread: ");
            String threadName = scanner.next();

            System.out.print("Enter the lower range of the counter: ");
            int lowerRange = scanner.nextInt();

            System.out.print("Enter the upper range of the counter: ");
            int upperRange = scanner.nextInt();

            CounterThread thread = new CounterThread(threadName, lowerRange, upperRange);
            thread.start();
        }
    }
}