import java.util.Scanner;

class SharedStringResource {
    synchronized void printString(String threadName, String message) {
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println(threadName + " - Word: " + word);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                String newMessage;
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Enter a message to print:");
                    newMessage = scanner.nextLine(); // Renamed variable to avoid conflict
                }
                System.out.println(newMessage);
                System.out.println(e.getMessage());
            }
        }
    }
}

class WorkerThread extends Thread {
    SharedStringResource resource;
    String threadName;

    WorkerThread(SharedStringResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        resource.printString(threadName, "I Love Java Very Much");
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        SharedStringResource resource = new SharedStringResource();

        WorkerThread thread1 = new WorkerThread(resource, "Thread 1");
        WorkerThread thread2 = new WorkerThread(resource, "Thread 2");

        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted: " + e.getMessage());
        }

        thread2.start();
        try {
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted: " + e.getMessage());
        }
    }
}