import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");
        
        System.out.println("First number:");
        int num1 = variable.nextInt();

        System.out.println("Second number:");
        int num2 = variable.nextInt();

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
