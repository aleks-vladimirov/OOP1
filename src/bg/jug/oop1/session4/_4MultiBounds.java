package bg.jug.oop1.session4;

import bg.jug.oop1.libs.Animal;
import bg.jug.oop1.libs.internal.BaseAnimal;
import bg.jug.oop1.libs.internal.GrassEaters;

public class _4MultiBounds {

    //Multi bound,
    static class Cheetach<D extends GrassEaters & Animal> {

    }
/*
    static class Lion<D extends GrassEaters & BaseAnimal> {

    }*/

    static class Tiger<D extends Animal & GrassEaters> {

    }
}


