package patterns.generative.factory;

public class FactoryTest {
    public static void main(String[] args) throws Exception {
        String windows = "windows";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(windows);
        os.getOS();
    }
}
