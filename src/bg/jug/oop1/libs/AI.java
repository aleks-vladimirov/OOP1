package bg.jug.oop1.libs;

import bg.jug.oop1.libs.internal.BaseAnimal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AI implements Cloneable {

    /**
     * PIE
     * пай
     * P - polymorphism
     * I - Inheritance
     * E - encapsulation
     */


    /**
     * bg.jug.oop1.libs.Dog
     *                  Sheep...
     *
     * bg.jug.oop1.libs.internal.BaseAnimal
     *
     */



    public static void main(String[] args) {
        Animal animal = new BaseAnimal();

        if(animal instanceof BaseAnimal) {
            Object baseAnimalClass = (Object) animal;
            if(baseAnimalClass instanceof ArrayList) {
                List list = (ArrayList) baseAnimalClass;
            }
            //System.out.println(baseAnimalClass.legs);
           // System.out.println(baseAnimalClass.getMealSize());
           // System.out.println(baseAnimalClass.name);
           // System.out.println(baseAnimalClass.family);

            System.out.println(BaseAnimal.MEAL_SIZE);


            Animal newAnimal = (Animal) baseAnimalClass;
            AI.voice(newAnimal);
        }





        Animal sheep = new Sheep();
       // AI.voice(sheep);

        Animal dog = new Dog();

        System.out.println( ((Dog)dog).name );
        //AI.voice(dog);
    }

    public static void voice(Animal animal) {
        animal.voice();
    }


}
