package calculator;

import java.util.Scanner;

import static calculator.Messages.*;

public class Menu {

    public void menuInfo(int num1, int num2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();

        print_msg(MENU);

        int opt = variable.nextInt();

        switch (opt) {
            case 1:
                function.sum(num1, num2);
                break;

            case 2:
                function.subtraction(num1, num2);
                break;

            case 3:
                function.multiplication(num1, num2);
                break;

            case 4:
                function.division(num1, num2);
                break;

            case 5:
                break;
        }
    }
}
