import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void takeTimeFromUser() throws HrsException, MinException, SecException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter hours: ");
            hours = scanner.nextInt();
            if (hours < 0 || hours > 24) {
                throw new HrsException("Hours should be between 0 and 24");
            }

            System.out.print("Enter minutes: ");
            minutes = scanner.nextInt();
            if (minutes < 0 || minutes > 60) {
                throw new MinException("Minutes should be between 0 and 60");
            }

            System.out.print("Enter seconds: ");
            seconds = scanner.nextInt();
        }

        if (seconds < 0 || seconds > 60) {
            throw new SecException("Seconds should be between 0 and 60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class userDefinedException {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.takeTimeFromUser();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
