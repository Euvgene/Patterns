package patterns.generative.abstract_factory.usa;

import patterns.generative.abstract_factory.cars.Toyota;

public class USAToyotaImpl implements Toyota {
    @Override
    public long getToyotaPrice() {
        return 18000;
    }
}
