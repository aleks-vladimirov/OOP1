package bg.jug.oop1.libs;

import bg.jug.oop1.libs.internal.BaseAnimal;

/**
 * Dog -> BaseAnimal -> Animal
 * voice() -> voice()
 *
 */


public class Dog extends BaseAnimal implements Animal {


    @Override
    public void voice() {
        System.out.println("Bark");
        super.voice();
    }
}
