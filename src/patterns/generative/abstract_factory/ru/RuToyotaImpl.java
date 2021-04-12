package patterns.generative.abstract_factory.ru;

import patterns.generative.abstract_factory.cars.Toyota;

public class RuToyotaImpl implements Toyota {
    @Override
    public long getToyotaPrice() {
        return 1_650_000;
    }
}
