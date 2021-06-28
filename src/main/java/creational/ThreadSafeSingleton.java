package creational;
/*
    @Author - Sharath
    Singleton class with double check lock thread safe
 */
public class ThreadSafeSingleton{

    private static volatile ThreadSafeSingleton instance;
    public String SomeString;

    private ThreadSafeSingleton(String SomeString){
        this.SomeString = SomeString;
    }

    public static ThreadSafeSingleton getInstance(String SomeString){
        ThreadSafeSingleton anotherInstance = instance;
        if (anotherInstance != null) {
            return anotherInstance;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(SomeString);
            }
            return instance;
        }
    }
}