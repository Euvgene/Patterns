package patterns.generative.abstract_factory;

import patterns.generative.abstract_factory.abs_factory.AbsFactory;
import patterns.generative.abstract_factory.abs_factory.RuCarPriceAbsFactory;
import patterns.generative.abstract_factory.abs_factory.USACarPriceAbsFactory;
import patterns.generative.abstract_factory.cars.Lada;

import java.util.Scanner;

public class AbsFactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        try {
            AbsFactory factory = null;
            if (country.equals("Russia")) {
                factory = new RuCarPriceAbsFactory();
            } else if (country.equals("USA")) {
                factory = new USACarPriceAbsFactory();
            }
            Lada lada = factory.getLada();
            System.out.println(lada.getLadaPrice());
        } catch (Exception ex) {
            System.out.println(("wrong country"));
        }
        scanner.close();
    }
}
