package javabasics;

public class Condition2Exam {

    public static void main(String[] args) {

        int firstNumber = 344 ;
        int secondNumber = 55 ;

        if (firstNumber > secondNumber){

            System.out.println("first number is greater");

        }

        else if ( firstNumber == secondNumber){

            System.out.println("equal");
        }

        else {   // false positive statment

            System.out.println("second number is greater");
        }

    }
}
