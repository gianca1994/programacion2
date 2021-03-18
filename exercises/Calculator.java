import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");
        
        System.out.println("First number:");
        int num1 = variable.nextInt();

        System.out.println("Second number:");
        int num2 = variable.nextInt();

        System.out.println("Enter the option you want to perform: 
            1- Sum
            2- Subtraction
            3- Multiplication
            4- Division
            5- Exit"
        );

        int operacion = variable.nextInt();

        switch(operacion){
            case "1":

                break;

            case "2":
                
                break;

            case "3":
                
                break;
            
            case "4":
                
                break;

            case "5":
                break;

            public void sum() {
                int resultSum = num1 + num2;
                System.out.println("resultSum: " + resultSum);
            }

            public void subtraction() {
                int resultSum = num1 - num2;
                System.out.println("resultSubtraction: " + resultSubtraction);
            }

            public void multiplication() {
                int resultMultiplication = num1 * num2;
                System.out.println("resultMultiplication: " + resultMultiplication);
            }

            public void division() {
                float resultDivision = num1 / num2;
                System.out.println("resultDivision: " + resultDivision);
            } 
    }
}
