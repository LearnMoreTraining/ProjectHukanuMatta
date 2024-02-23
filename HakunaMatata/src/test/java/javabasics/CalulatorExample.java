package javabasics;

public class CalulatorExample {

    public static void main(String[] args) {

        int a = 22 ;
        int b = 10 ;

        String operator = "/";

        if (operator.equals("+")) {

            System.out.println( a+b);
        }
        else if( operator.equals("-")){

            if(a > b ){

                System.out.println(a-b);
            }
            else{
                System.out.println(b-a);
            }
        }
        else if(operator.equals("*")){

            System.out.println( a * b);
        }
        else if (operator.equals("/")) {

            if (a == 0 || b == 0 ){

                System.out.println("can't divisable");
            }
            else{

                System.out.println(a/b);
            }
        }
        else{

        }

    }
}
