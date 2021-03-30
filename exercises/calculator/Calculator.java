package calculator;

import java.util.Scanner;

import static calculator.Messages.*;

class Calculator {

    public static void main(String[] args) throws IllegalStateException {

        Menu menuInfoMenu = new Menu();
        MultiVar multivar = new MultiVar();
        Scanner variable = new Scanner(System.in);
        int num_of_numbers, num1, num2, opt;

        print_msg(WELCOME);
        print_msg(MENU_SELECT);

        opt = variable.nextInt();

        switch (opt) {

            case 1:
                print_msg(FIRST_NUMBER);
                num1 = variable.nextInt();

                print_msg(SECOND_NUMBER);
                num2 = variable.nextInt();

                menuInfoMenu.menuInfo(num1, num2);

            case 2:
                print_msg(OPERATION_NUMBERS);
                num_of_numbers = variable.nextInt();
                multivar.MultVar(num_of_numbers);

            default:
                throw new IllegalStateException(ERROR_NUMERIC + opt);
        }
    }
}


