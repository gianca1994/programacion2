package calculator;

import java.util.Scanner;

import static calculator.Messages.*;
import static calculator.Functions.*;

class Calculator {

    Scanner variable = new Scanner(System.in);

    public void main(String[] args) throws IllegalStateException {
        Menu menuInfoMenu = new Menu();
        MultiVar multivar = new MultiVar();

        getMsgInitials();

        switch (setOptionSwitch()) {
            case 1 -> menuInfoMenu.menuInfo(setFirstNumber(), setSecondNumber());
            case 2 -> multivar.MultVar(setNumbers());
            default -> throw new IllegalStateException(ERROR_NUMERIC + setOptionSwitch());
        }
    }

    public int setNumbers() {
        print_msg(OPERATION_NUMBERS);
        return variable.nextInt();
    }

    public int setFirstNumber() {
        print_msg(FIRST_NUMBER);
        return variable.nextInt();
    }

    public int setSecondNumber() {
        print_msg(SECOND_NUMBER);
        return variable.nextInt();
    }

    public void getMsgInitials() {
        print_msg(WELCOME);
        print_msg(MENU_SELECT);
    }
}


