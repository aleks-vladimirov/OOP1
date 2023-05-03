package bg.jug.oop1.libs;

public class Sheep implements Animal {

    @Override
    public void voice() {
        System.out.println("Beeee");
    }


    public void walk() {
        System.out.println("I am walking");
    }
}
