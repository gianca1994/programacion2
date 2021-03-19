package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static final String menu = """
            Enter the option you want to perform:\s
            1- Sum
            2- Subtraction
            3- Multiplication
            4- Division
            5- Exit""";

    public void menuInfo(int num1, int num2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();
        Messages messages = new Messages();

        messages.print_msg(menu);

        int opt = variable.nextInt();

        switch (opt) {
            case 1:
                //function.sum(args);
                function.sum(num1, num2);
                break;

            case 2:
                //function.subtraction(args);
                function.subtraction(num1, num2);
                break;

            case 3:
                //function.multiplication(args);
                function.multiplication(num1, num2);
                break;

            case 4:
                //function.division(args);
                function.division(num1, num2);
                break;

            case 5:
                break;
        }
    }
}
