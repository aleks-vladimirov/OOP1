package bg.jug.oop1.session3.principles;

/**
 * SOLID
 * O - Open for Extension, Closed for Modification
 */
public class Principle2 {

    interface Localization {
        String getBrandName(String localLang);
    }
    static class Vehicle {
        private String brandName;

        Vehicle(String brandName) {
            this.brandName = brandName;
        }

        final String getBrandName() {
            return "Vehicle " + brandName + " brand name";
        }
    }
        static class PravetsCar extends Vehicle implements Localization {

        PravetsCar() {
            super("Правец Кар");
        }

            @Override
            public String getBrandName(String localLang) {
                return "Колата правец е мега яката";
            }
        }

    public static void main(String[] args) {

        Principle2.Vehicle vehicle = new Vehicle("BMW");

        Principle2.PravetsCar pravetsCar = new PravetsCar();

        System.out.println(vehicle.getBrandName());

        System.out.println(pravetsCar.getBrandName());
        System.out.println(pravetsCar.getBrandName(null));


    }


}
