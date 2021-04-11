package patterns.generative.factory;

public class Mac implements OS{
    @Override
    public void getOS() {
        System.out.println("Применяем для mac");
    }
}
