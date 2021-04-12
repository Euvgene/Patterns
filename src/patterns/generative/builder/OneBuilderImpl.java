package patterns.generative.builder;

public class OneBuilderImpl extends Builder{
    public OneBuilderImpl() {
        car = new Car();
    }

    @Override
    public Car buildCar() {
        car.buildBody();
        car.buildWheel();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        return car;
    }
}
