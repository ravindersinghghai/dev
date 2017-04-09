/**
 * Static block initialization implementation is similar to eager initialization, except that
 * instance of class is created in the static block that provides option for exception handling.
 *
 * Both eager initialization and static block initialization creates the instance even before
 * it’s being used and that is not the best practice to use.
 */

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        this.instance = instance;
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred in creating singleton instance.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
