package calculator;

import java.util.Scanner;

public class Menu {
    public void menuInfo(int num1, int num2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();
        Messages messages = new Messages();

        messages.msgMenu();

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
