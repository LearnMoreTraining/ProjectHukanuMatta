package javabasics;

public class PolyExample {

    public static void main(String[] args) {


        PolyExample e =new PolyExample();

        e.m1(2,3);
    }


    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){

        System.out.println(a);
    }

    public void m1(int a , int b){

        System.out.println(a);
        System.out.println(b);
    }
}
