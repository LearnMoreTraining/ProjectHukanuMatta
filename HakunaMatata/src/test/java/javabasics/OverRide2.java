package javabasics;

public class OverRide2 extends OverRide1 {

    public static void main(String[] args) {

        OverRide1 a = new OverRide1();
        a.m1();
    }

    public void m1(){
        System.out.println("1");
    }
}
