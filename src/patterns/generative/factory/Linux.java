package patterns.generative.factory;

public class Linux implements OS{
    @Override
    public void getOS() {
        System.out.println("Применяем для linux");
    }
}
