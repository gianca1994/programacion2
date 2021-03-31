package calculator;

import java.util.Scanner;

import static calculator.Setters.*;
import static calculator.Messages.*;
import static calculator.Operations.*;
import static calculator.Printer.*;

public class Menu {

    public static void showMainMenu(){
        Scanner var = new Scanner(System.in);
        MultiVar multiVar = new MultiVar();

        switch (setOptionSwitch()) {
            case 1 -> showInfoMenu(setFirstNumber(var), setSecondNumber(var));
            case 2 -> multiVar.MultVar(setNumbers(var));
            default -> throw new IllegalStateException(ERROR_NUMERIC + setOptionSwitch());
        }
    }

    public static void showInfoMenu(double num1, double num2) {

        print_msg(MENU);

        switch (setOptionSwitch()) {
            case 1 -> print_result(MSG_SUM,doSum(num1, num2));
            case 2 -> print_result(MSG_SUBTRAC, doSubtraction(num1, num2));
            case 3 -> print_result(MSG_MULT, doMultiplication(num1, num2));
            case 4 -> print_result(MSG_DIV, doDivision(num1, num2));
            case 5 -> System.exit(0);
        }
    }
}
