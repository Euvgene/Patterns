package patterns.generative.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        mySingleton singleton = mySingleton.getInstance();
        mySingleton singleton2 = mySingleton.getInstance();

        boolean isEqual = singleton2.equals(singleton);
        System.out.println(isEqual);
    }
}
