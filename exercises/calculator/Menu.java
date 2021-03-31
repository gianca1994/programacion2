package calculator;

import java.util.Scanner;

import static calculator.Functions.*;
import static calculator.Messages.*;

public class Menu {

    public static void menuInitial(){
        Scanner var = new Scanner(System.in);
        MultiVar multiVar = new MultiVar();

        switch (setOptionSwitch()) {
            case 1 -> menuInfo(setFirstNumber(var), setSecondNumber(var));
            case 2 -> multiVar.MultVar(setNumbers(var));
            default -> throw new IllegalStateException(ERROR_NUMERIC + setOptionSwitch());
        }
    }

    public static void menuInfo(int num1, int num2) {

        print_msg(MENU);

        switch (setOptionSwitch()) {
            case 1 -> sum(doSum(num1, num2));
            case 2 -> subtraction(doSubtraction(num1, num2));
            case 3 -> multiplication(doMultiplication(num1, num2));
            case 4 -> division(doDivision(num1, num2));
            case 5 -> System.exit(0);
        }
    }
}
