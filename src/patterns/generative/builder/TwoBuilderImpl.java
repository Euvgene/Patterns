package patterns.generative.builder;

public class TwoBuilderImpl extends Builder {
    public TwoBuilderImpl() {
        car = new Car();
    }

    @Override
    public Car buildCar() {
        car.buildBody();
        car.buildWheel();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        engine = new TwoEngine();
        car.buildEngine(engine);
        return car;
    }
}
