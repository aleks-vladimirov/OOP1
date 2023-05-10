package bg.jug.oop1.session4;

import bg.jug.oop1.libs.internal.GrassEaters;

import java.util.ArrayList;
import java.util.List;

public class _3BoundedType {

    static class Lion<Food extends GrassEaters> {

        List<Food> foodList = new ArrayList<>();

        public void addEatenAnimals(Food animal) {
            foodList.add(animal);
        }
    }

    public static void main(String[] args) {
        Lion<GrassEaters> lion = new Lion<>();

        lion.addEatenAnimals(new GrassEaters() {
            @Override
            public void eatGrass() {

            }

            @Override
            public void voice() {

            }
        });
    }
}
