import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();

        Scanner variable = new Scanner(System.in);

        int num1, num2;

        System.out.println("Welcome to the calculator programmed in java then enter 2 numbers");

        System.out.println("First number:");
        num1 = variable.nextInt();

        System.out.println("Second number:");
        num2 = variable.nextInt();

        menuInfoMenu.menuInfo(num1, num2);
    }
}

class Menu {
    public void menuInfo(int number1, int number2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();

        System.out.println("Enter the option you want to perform: ");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exit");

        int opt = variable.nextInt();

        switch (opt) {
            case 1:
                function.sum(number1, number2);
                break;

            case 2:
                function.subtraction(number1, number2);
                break;

            case 3:
                function.multiplication(number1, number2);
                break;

            case 4:
                function.division(number1, number2);
                break;

            case 5:
                break;
        }
    }
}

class Functions{

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

    public void division(float num1, float num2) {
        float resultDivision = num1 / num2;
        System.out.println("resultDivision: " + resultDivision);
    }
}