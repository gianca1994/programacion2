import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

class Calculator {

    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();
        Numbers setNumbers = new Numbers();
        setNumbers.intNumbers();
        menuInfoMenu.menuInfo();
    }
        
        public void sum(int num1, int num2) {
            int resultSum = num1 + num2;
            System.out.println("resultSum: " + resultSum);
        }

        public void subtraction(int num1, int num2) {
            int resultSubtraction = num1 - num2;
            System.out.println("resultSubtraction: " + resultSubtraction);
        }

        public void multiplication(int num1, int num2) {
            int resultMultiplication = num1 * num2;
            System.out.println("resultMultiplication: " + resultMultiplication);
        }

        public void division(int num1, int num2) {
            float resultDivision = num1 / num2;
            System.out.println("resultDivision: " + resultDivision);
        }
    
}

class Menu{
    public static void menuInfo() {

        Scanner variable = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int number1, number2;

        System.out.println("Enter the option you want to perform: ");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exit");

        int operacion = variable.nextInt();

        switch(operacion){
            case 1:
                calculator.sum(number1, number2);
                break;

            case 2:
                calculator.subtraction(number1, number2);
                break;

            case 3:
                calculator.multiplication(number1, number2);
                break;
            
            case 4:
                calculator.division(number1, number2);
                break;

            case 5:
                break;}
    }
}

class Numbers{
    public static void intNumbers() {
        Scanner variable = new Scanner(System.in);
        int num1, num2;

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");
            
        System.out.println("First number:");
        num1 = variable.nextInt();

        System.out.println("Second number:");
        num2 = variable.nextInt();
    }
}