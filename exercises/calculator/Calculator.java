package calculator;

import java.util.Scanner;

import static calculator.Messages.*;
import static calculator.Functions.*;

class Calculator {

    public static void main(String[] args) throws IllegalStateException {
        Menu menuInfoMenu = new Menu();
        MultiVar multivar = new MultiVar();
        Scanner var = new Scanner(System.in);

        getMsgInitials();

        switch (setOptionSwitch()) {
            case 1 -> menuInfoMenu.menuInfo(setFirstNumber(var), setSecondNumber(var));
            case 2 -> multivar.MultVar(setNumbers(var));
            default -> throw new IllegalStateException(ERROR_NUMERIC + setOptionSwitch());
        }
    }

    public static int setNumbers(Scanner var) {
        print_msg(OPERATION_NUMBERS);
        return var.nextInt();
    }

    public static int setFirstNumber(Scanner var) {
        print_msg(FIRST_NUMBER);
        return var.nextInt();
    }

    public static int setSecondNumber(Scanner var) {
        print_msg(SECOND_NUMBER);
        return var.nextInt();
    }

    public static void getMsgInitials() {
        print_msg(WELCOME);
        print_msg(MENU_SELECT);
    }
}


