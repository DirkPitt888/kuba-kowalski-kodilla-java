package com.kodilla.testing.calculator;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
        public static void main (String[]args){
            Calculator calculator = new Calculator();
            int result = calculator.addAToB(5, 5);
            int secondResult = calculator.substractAFromB(5, 5);


            if (result == 10) {
                System.out.println("test OK");
            } else {
                System.out.println("Error !");
            }
            if (secondResult == 0) {
                System.out.println("test is OK");
            } else {
                System.out.println("Test is negative");
            }
        }
    }
