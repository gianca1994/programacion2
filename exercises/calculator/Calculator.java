package calculator;

import java.util.Scanner;

class Main {

    static final String welcome = "Welcome to the calculator, enter the number " +
            "of numbers to which you want to apply an operation",
            firstNumber = "First number:", secondNumber = "Second number:";

    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();
        Messages messages = new Messages();
        MultiVar multivar = new MultiVar();
        Scanner variable = new Scanner(System.in);
        int num_of_numbers, num1, num2;

        messages.print_msg(welcome);

        num_of_numbers = variable.nextInt();

        if (num_of_numbers > 2) {
            // ANDA MAL JEJE
            // multivar.multiVariable(num_of_numbers);
        } else {
            messages.print_msg(firstNumber);
            num1 = variable.nextInt();

            messages.print_msg(secondNumber);
            num2 = variable.nextInt();

            menuInfoMenu.menuInfo(num1, num2);
        }

        //multivar.multiVariable(num_of_numbers);
    }
}


