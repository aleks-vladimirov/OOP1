package bg.jug.oop1.session3.principles;

import java.util.Arrays;
import java.util.List;

/**
 * SOLID
 * L - Liskov Substitution
 */
public class Principle3 {

    interface Car {
        double getLitersPer100km();
    }

    static class Ferrari implements Car {

        @Override
        public double getLitersPer100km() {
            return 15.8;
        }
    }

    static class PorcheCarrera911 implements Car {

        @Override
        public double getLitersPer100km() {
            return 11.3;
        }
    }


    interface ElectricalCars {
    }
    static class TeslaModelS implements ElectricalCars {

    }

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Ferrari(), new PorcheCarrera911());
        for(Car car : cars) {
            System.out.println(car.getLitersPer100km());
        }
    }
}
