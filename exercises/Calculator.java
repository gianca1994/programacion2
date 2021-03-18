import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();
        Messages messages = new Messages();
        MultiVar multivar = new MultiVar();
        Scanner variable = new Scanner(System.in);
        int num1, num2, num_of_numbers;

        messages.msgWelcome();

        num_of_numbers = variable.nextInt(); 

        if (num_of_numbers > 2) {
            multivar.multiVariable(num_of_numbers);
        }else{
            messages.msgFirstNumber();
            num1 = variable.nextInt();
    
            messages.msgSecondNumber();
            num2 = variable.nextInt();

            menuInfoMenu.menuInfo(num1, num2);
        }
    }
}

class Menu {
    public void menuInfo(int number1, int number2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();
        Messages messages = new Messages();

        messages.msgMenu();

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

    Messages messages = new Messages();

    public void sum(int num1, int num2) {
        int resultSum = num1 + num2;
        messages.msgSum(resultSum);
    }

    public void subtraction(int num1, int num2) {
        int resultSubtraction = num1 - num2;
        messages.msgSubtrac(resultSubtraction);
    }

    public void multiplication(int num1, int num2) {
        int resultMultiplication = num1 * num2;
        messages.msgmult(resultMultiplication);
    }

    public void division(float num1, float num2) {
        float resultDivision = num1 / num2;
        messages.msgdiv(resultDivision);
    }
}

class MultiVar{

    public void multiVariable(int opt) {
        Scanner variable = new Scanner(System.in);

        int i = 0;
        while (true) {

            i++;

            int num = variable.nextInt();
            System.out.println(num);
            
            if (i==opt) {break;}
        }    
    }
}

class Messages{

    public void msgWelcome(){
        System.out.println("Welcome to the calculator, enter the number of numbers to which you want to apply an operation");
    }

    public void msgFirstNumber(){
        System.out.println("First number:");
    }

    public void msgSecondNumber(){
        System.out.println("Second number:");
    }

    public void msgMenu(){
        System.out.println("Enter the option you want to perform: ");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exit");
    }

    public void msgSum(int val){
        System.out.println("Result of the sum: " + val);
    }

    public void msgSubtrac(int val){
        System.out.println("Result of the subtraction: " + val);
    }

    public void msgmult(int val){
        System.out.println("Multiplication result: " + val);
    }

    public void msgdiv(float val){
        System.out.println("Division result: " + val);
    }
}
