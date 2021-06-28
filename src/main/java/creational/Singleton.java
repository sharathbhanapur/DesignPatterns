package creational;

/*
    @Author - Sharath
    Singleton class with out thread safe
 */
public class Singleton {
    private static Singleton instance;
    public String SomeString;

    private Singleton(String SomeString){
        this.SomeString = SomeString;
    }

    public static Singleton getInstance(String SomeValue){
        if(instance == null){
            instance = new Singleton(SomeValue);
        }
        return instance;
    }
}