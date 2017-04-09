/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback that instance is created
 * even though client application might not be using it.
 *
 * Both eager initialization and static block initialization creates the instance even before
 * it’s being used and that is not the best practice to use.
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    // //private constructor to avoid client applications to use constructor
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
