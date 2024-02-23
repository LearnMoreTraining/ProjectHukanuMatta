package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {


    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();

        s.add(78);
        s.add(1);
        s.add(45);
        s.add(78);
        s.add(45);
        System.out.println(s);
    }
}
