package patterns.generative.abstract_factory.abs_factory;

import patterns.generative.abstract_factory.cars.Honda;
import patterns.generative.abstract_factory.cars.Lada;
import patterns.generative.abstract_factory.cars.Toyota;
import patterns.generative.abstract_factory.usa.USAHondaImpl;
import patterns.generative.abstract_factory.usa.USALadaImpl;
import patterns.generative.abstract_factory.usa.USAToyotaImpl;

public class USACarPriceAbsFactory implements AbsFactory {
    @Override
    public Lada getLada() {
        return new USALadaImpl();
    }

    @Override
    public Honda getHonda() {
        return new USAHondaImpl();
    }

    @Override
    public Toyota getToyota() {
        return new USAToyotaImpl();
    }
}
