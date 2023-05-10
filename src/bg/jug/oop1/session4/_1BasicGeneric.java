package bg.jug.oop1.session4;

public class _1BasicGeneric {



    static class RepairShop<Brand> {
        //method allows to use generic type
        private Brand brand;

        RepairShop(Brand brand) {
            this.brand = brand;
        }

        public Brand getCarBrand() {
            return brand;
        }

        public void repair() {

        }
    }

    public static void main(String[] args) {

    }
}
