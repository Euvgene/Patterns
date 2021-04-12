package patterns.generative.factory;

public class WindowsOS implements OS{
    @Override
    public void getOS() {
        System.out.println("применяем для windows");
    }
}
