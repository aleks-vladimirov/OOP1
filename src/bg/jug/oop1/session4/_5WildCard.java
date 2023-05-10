package bg.jug.oop1.session4;

import bg.jug.oop1.libs.Animal;
import bg.jug.oop1.libs.internal.African;
import bg.jug.oop1.libs.internal.GrassEaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _5WildCard {


    static class Lion<Food> {

        List<Food> foodList = new ArrayList<>();

        public void addEatenAnimals(Food animal) {
            foodList.add(animal);
        }

        public void makeSound() {
            throw new UnsupportedOperationException();
        }

    }

    interface  Sound {
        default void makeSound() {
            System.out.println("Roar");
        }
    }


    interface Antilopa extends GrassEaters {

    }

    interface SmallAnimal extends GrassEaters {

    }

    static class Lions {

        public <S extends Sound> void makeSound(S sound) {
            sound.makeSound();
        }

        public void eatAnimal(Antilopa eat) {

        }

        public void eatAnimal(SmallAnimal eat) {

        }

    }

    static class Lions2 implements Sound {

        public void makeSound(Lion<? extends Sound> lion) {
            lion.makeSound();
        }
    }


    public static void main(String[] args) {


        Lions lions = new Lions();

        lions.makeSound(new Sound() {
            @Override
            public void makeSound() {
                System.out.println("Roar");
            }
        });

        Lions2 lions2 = new Lions2();

        lions2.makeSound();


/*
        //compile
        List item1 = new LinkedList<>();
        item1.add(new Object());

        List<?> item = new LinkedList<>();
        //Wildcard prevents usage of this statement
        //item.add(new Object());

        List<Integer1> numbers = new ArrayList<>();
        List<LongerNumber> numbers2 = new ArrayList<>();

        printTest(numbers);
        printTest(numbers2);*/
    }


    static void printTest(List<? extends Integer1> param) {
        System.out.println(param);

    }



    static class LongerNumber extends Integer1 {

    }

    static class Integer1 {

    }


}
