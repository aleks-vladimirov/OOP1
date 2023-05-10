package bg.jug.oop1.session4;

import java.util.LinkedList;
import java.util.List;

public class _1BasicGeneric {

    static class PorscheRepairShop implements Audi{

    }

    interface Audi {


    }

    static class MercedesRepairShop {

    }


    static class BasicRepairShop<Brand extends Audi> {
        //method allows to use generic type
        private Brand brand;

        BasicRepairShop(Brand brand) {
            this.brand = brand;
        }

        public Brand getCarBrand() {
            return brand;
        }

        public void repair() {
        }
    }

    public static void main(String[] args) {
        BasicRepairShop<PorscheRepairShop> repairShop =
                new BasicRepairShop<>(new PorscheRepairShop());

        List<BasicRepairShop> repairShopList = new LinkedList<>();

       // repairShopList.add(new String("sdf sdf"));

    }
}
