import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);

        int num1, num2;

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");
            
        System.out.println("First number:");
        num1 = variable.nextInt();

        System.out.println("Second number:");
        num2 = variable.nextInt();

        System.out.println("Enter the option you want to perform: ");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exit");

        int operacion = variable.nextInt();

        switch(operacion){
            case 1:
                sum(num1, num2);
                break;

            case 2:
                subtraction(num1, num2);
                break;

            case 3:
                multiplication(num1, num2);
                break;
            
            case 4:
                division(num1, num2);
                break;

            case 5:
                break;}}

        private static void sum(int num1, int num2) {
            int resultSum = num1 + num2;
            System.out.println("resultSum: " + resultSum);
        }

        private static void subtraction(int num1, int num2) {
            int resultSubtraction = num1 - num2;
            System.out.println("resultSubtraction: " + resultSubtraction);
        }

        private static void multiplication(int num1, int num2) {
            int resultMultiplication = num1 * num2;
            System.out.println("resultMultiplication: " + resultMultiplication);
        }

        private static void division(int num1, int num2) {
            float resultDivision = num1 / num2;
            System.out.println("resultDivision: " + resultDivision);
        }
    
}