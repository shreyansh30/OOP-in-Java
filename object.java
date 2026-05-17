public class object {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Constructor increments the object count each time an object is created
    public object() {
        objectCount++;
    }

    // Static method to get the current object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects
        @SuppressWarnings("unused")
        object obj1 = new object();
        @SuppressWarnings("unused")
        object obj2 = new object();
        @SuppressWarnings("unused")
        object obj3 = new object();

        // Displaying the number of objects created
        System.out.println("Number of objects created: " + object.getObjectCount());
    }
}