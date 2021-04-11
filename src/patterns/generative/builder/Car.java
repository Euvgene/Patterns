package patterns.generative.builder;

public class Car {
    public void buildBody() {
        System.out.println("Делаем корпус");
    }

    public void buildWheel() {
        System.out.println("Делаем колесо");
    }

    public void buildEngine(Engine engine) {
        System.out.println("Ставим движок " + engine.getType());
    }
}
