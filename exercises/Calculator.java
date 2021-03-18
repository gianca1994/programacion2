import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {

        Scanner variable = new Scanner(System.in);

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");
        
        System.out.println("First number:");
        int num1 = variable.nextInt();

        System.out.println("Second number:");
        int num2 = variable.nextInt();
        
        int resultSum = num1 + num2;
        int resultSubtraction = num1 - num2;
        int resultMultiplication = num1 * num2;
        float resultDivision = num1 / num2;

        System.out.println("resultSum: " + resultSum);
        System.out.println("resultSubtraction: " + resultSubtraction);
        System.out.println("resultMultiplication: " + resultMultiplication);
        System.out.println("resultDivision: " + resultDivision);
    }
}
