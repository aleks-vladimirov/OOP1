package bg.jug.oop1.session4;

import bg.jug.oop1.libs.Animal;
import bg.jug.oop1.libs.internal.African;
import bg.jug.oop1.libs.internal.GrassEaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _5WildCard {


    static class Lion<Food extends GrassEaters> {

        List<Food> foodList = new ArrayList<>();

        public void addEatenAnimals(Food animal) {
            foodList.add(animal);
        }

        public void makeSound() {
            System.out.println("Roar");
        }
    }

    interface  Sound {
        void makeSound();
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

    static class Lions2 {

        public void makeSound(Lion<? extends GrassEaters> lion) {
            lion.makeSound();
        }
    }


    public static void main(String[] args) {

        /*List<?> item = new LinkedList<>();
        item.add(new Object());*/


       /* List<Number> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        printTest(numbers);
        printTest(numbers2);*/
    }

    static void printTest(List<? super Integer> param) {
        System.out.println(param);

    }

}
