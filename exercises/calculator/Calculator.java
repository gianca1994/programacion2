package calculator;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();
        Messages msg = new Messages();
        MultiVar multivar = new MultiVar();
        Scanner variable = new Scanner(System.in);
        int num_of_numbers, num1, num2;

        msg.print_msg(msg.welcome);

        num_of_numbers = variable.nextInt();

        if (num_of_numbers > 2) {
            // ANDA MAL JEJE
            // multivar.multiVariable(num_of_numbers);
            msg.print_msg(msg.firstNumber);
            num1 = variable.nextInt();

            msg.print_msg(msg.secondNumber);
            num2 = variable.nextInt();

            menuInfoMenu.menuInfo(num1, num2);

        } else {
            msg.print_msg(msg.firstNumber);
            num1 = variable.nextInt();

            msg.print_msg(msg.secondNumber);
            num2 = variable.nextInt();

            menuInfoMenu.menuInfo(num1, num2);
        }

        //multivar.multiVariable(num_of_numbers);
    }
}


