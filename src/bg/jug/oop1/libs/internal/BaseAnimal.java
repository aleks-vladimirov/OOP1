package bg.jug.oop1.libs.internal;

import bg.jug.oop1.libs.Animal;

public class BaseAnimal implements Animal {

    public int legs;
    private int mealSize;

    public static final int MEAL_SIZE = 100;

    public String name;

    String family;

    public BaseAnimal() {
        this(100);
    }

    BaseAnimal(int mealSize) {
       this(mealSize, null);
    }

    public BaseAnimal(int mealSize, String name) {
        this.mealSize = mealSize;
        this.name = name;
    }



    public static BaseAnimal getInstance() {

        return new BaseAnimal(100);
    }

    public void voice() {
        System.out.println("Аз съм животно");

    }


    public void isMeatEater() {

    }

    public int getMealSize() {
        //calculate
        return legs * 10 + mealSize;
    }


}
