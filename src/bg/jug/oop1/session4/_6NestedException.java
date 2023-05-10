package bg.jug.oop1.session4;

import java.util.ArrayList;
import java.util.List;

public class _6NestedException {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();

        lists.add(new ArrayList<>());

        lists.get(0);


        List<?> objects = (List<?>) lists.get(0);

        if( lists instanceof List<List<Integer>> ) {

        }
    }
}
