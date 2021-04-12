package patterns.generative.abstract_factory.usa;

import patterns.generative.abstract_factory.cars.Lada;

public class USALadaImpl implements Lada {
    @Override
    public long getLadaPrice() {
        return 8000;
    }
}
