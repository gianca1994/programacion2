package calculator;

import static calculator.Functions.*;
import static calculator.Messages.*;

public class Menu {

    public void menuInfo(int num1, int num2) {

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
