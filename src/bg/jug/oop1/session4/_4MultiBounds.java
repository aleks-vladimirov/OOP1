package bg.jug.oop1.session4;

import bg.jug.oop1.libs.Animal;
import bg.jug.oop1.libs.internal.BaseAnimal;
import bg.jug.oop1.libs.internal.GrassEaters;

import java.io.Serializable;

public class _4MultiBounds {

    //Multi bound,
    static class Cheetach<D extends GrassEaters & Animal & Cloneable & Serializable> {


    }

    static class Lion<D extends BaseAnimal & GrassEaters & Animal > {

    }

    static class Tiger<D extends Animal & GrassEaters> {

    }
}


