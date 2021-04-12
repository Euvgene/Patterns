package patterns.generative.abstract_factory.abs_factory;

import patterns.generative.abstract_factory.cars.Honda;
import patterns.generative.abstract_factory.cars.Lada;
import patterns.generative.abstract_factory.cars.Toyota;
import patterns.generative.abstract_factory.ru.RuHondaImpl;
import patterns.generative.abstract_factory.ru.RuLadaImpl;
import patterns.generative.abstract_factory.ru.RuToyotaImpl;

public class RuCarPriceAbsFactory implements AbsFactory {
    @Override
    public Lada getLada() {
        return new RuLadaImpl();
    }

    @Override
    public Honda getHonda() {
        return new RuHondaImpl();
    }

    @Override
    public Toyota getToyota() {
        return new RuToyotaImpl();
    }
}
