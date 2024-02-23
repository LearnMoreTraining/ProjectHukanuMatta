package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList();
        l.add(34);
        l.add(56);

        System.out.println(l);

        l.add(90);

        System.out.println(l);

        l.add(100);

        System.out.println(l);

        l.add(100);

        System.out.println(l);


        List <String> k = new ArrayList<>();
        k.add("abc");
        k.add("12");
        System.out.println(k);

        System.out.println( k.get(0));

        System.out.println(l.get(2));
    }
}
