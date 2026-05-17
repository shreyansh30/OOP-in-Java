class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class checkArgument {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Number of arguments should be four");
            }

            int sum = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += num * num;
            }

            System.out.println(sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments should be integers");
        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}