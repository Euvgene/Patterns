package patterns.generative.abstract_factory.ru;

import patterns.generative.abstract_factory.cars.Honda;

public class RuHondaImpl implements Honda {
    @Override
    public long getHondaPrice() {
        return 1_250_000;
    }
}
