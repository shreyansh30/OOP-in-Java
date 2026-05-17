interface Motor {
    public static final int CAPACITY = 2000;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing Machine is running...");
    }

    @Override
    public void consume() {
        System.out.println("Washing Machine is consuming power...");
    }
}

public class washing_machine {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("Capacity of the motor is " + Motor.CAPACITY);
        washingMachine.run();
        washingMachine.consume();
    }
}