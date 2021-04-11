package patterns.generative.abstract_factory.ru;

import patterns.generative.abstract_factory.cars.Lada;

public class RuLadaImpl  implements Lada {
    @Override
    public long getLadaPrice() {
        return 550_000;
    }
}
