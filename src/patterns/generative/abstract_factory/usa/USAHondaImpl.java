package patterns.generative.abstract_factory.usa;

import patterns.generative.abstract_factory.cars.Honda;

public class USAHondaImpl implements Honda {
    @Override
    public long getHondaPrice() {
        return 13000;
    }
}
