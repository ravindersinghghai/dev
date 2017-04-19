/**
 * Prior to Java 5, java memory model had a lot of issues with other approaches, they would fail in certain
 * scenarios where too many threads try to get the instance of the Singleton class simultaneously. So Bill
 * Pugh came up with a different approach to create the Singleton class using a inner static helper class.
 *
 * Notice the private inner static class that contains the instance of the singleton class. When the
 * singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls
 * the getInstance method, this class gets loaded and creates the Singleton class instance.
 *
 * This is the most widely used approach for Singleton class as it doesn’t require synchronization.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton obj1 = BillPughSingleton.getInstance();
        BillPughSingleton obj2 = BillPughSingleton.getInstance();
        System.out.println("Test to see if both objects point to the same memory location: "
                +obj1.equals(obj2));
    }
}
