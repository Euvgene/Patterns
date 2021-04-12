package patterns.generative.abstract_factory.abs_factory;

import patterns.generative.abstract_factory.cars.Honda;
import patterns.generative.abstract_factory.cars.Lada;
import patterns.generative.abstract_factory.cars.Toyota;

public interface AbsFactory {
    Lada getLada();
    Honda getHonda();
    Toyota getToyota();
}
