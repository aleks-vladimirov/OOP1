package bg.jug.oop1.session3.principles;

import java.util.ArrayList;
import java.util.List;

/**
 * SOLID
 * Single-responsibility principle
 */
public class Principle1 {

    class Car {
        int wheels;
        int doors;
        CarEngine engine;
    }

    interface CarEngine {

        int getOilConsumption();
    }

    class CarRepairSystem {

        StringBuilder bill;

        CarRepairSystem() {
            bill = new StringBuilder(100);
            bill.append("""
                    Car shop invoice 
                    Things performed on the car
                    """);
        }

        boolean isEngineGood(Car car) {
            //the ternary conditional operator
            bill.append("Car check: 100 BGN");
            return car.engine != null ?  true : false;
            }
     void printReceipt() {
        bill.append("""
                
                Final bill
                """);
        System.out.println(bill);
    }


    }

    class BetterCarRepairSystem extends CarRepairSystem {

        BetterCarRepairSystem() {
            super();
        }
        boolean isEngineGood(Car car) {
            if(car.engine == null) {
                return false;
            }
            if(car.engine.getOilConsumption() > 20) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        List checkedItems = new ArrayList();
        Principle1 principle1 = new Principle1();
        Principle1.Car car = principle1. new Car();

        car.engine = new CarEngine() {
            @Override
            public int getOilConsumption() {
                return 30;
            }
        };

        Principle1.BetterCarRepairSystem carRepairSystem = principle1.new BetterCarRepairSystem();

        carRepairSystem.isEngineGood(car);
        checkedItems.add("Oil checked");
        carRepairSystem.printReceipt();


    }

    class BillableSystem {

        private List checkedItems;
        BillableSystem(List checkedItems) {
            this.checkedItems = checkedItems;
        }

        public double calculateCost() {
            //checkedItems
            return 10.0;
        }
    }


}
