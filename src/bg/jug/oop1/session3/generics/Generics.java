package bg.jug.oop1.session3.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {


    interface Food<E extends Food> {

        E eat(E food);
    }

    interface DeliciousFood extends Food {

    }



    static class Meal<E extends Food> implements Food<E>{

        @Override
        public E eat(E food) {
            return food;
        }

        @Override
        public String toString() {
            return "Meal";
        }
    }

    static class Steak extends Meal {

    }


    public static void main(String[] args) {
       /* List<Integer> list = new ArrayList<>();


        list.add(100);

        if(list.get(0) instanceof Integer) {
            System.out.println((Integer) list.get(0) + 300);
        }
*/
        Food<Food> food = new Meal<>();

        System.out.println(food.eat(new Meal<>()));


    }
}
