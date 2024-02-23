package javabasics;

public class VariableExample {
    int h ;  // Global Variable

    public void m1(){

        h=45;
        int b = 7 ;  // local variable - life lies inside the method

        System.out.println(b);

        System.out.println(h);
    }

    public void m2(){

        int c = 45 ; //local variable
        System.out.println(h);
    }

}
