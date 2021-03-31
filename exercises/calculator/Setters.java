package calculator;

import java.util.Scanner;

import static calculator.Messages.*;
import static calculator.Printer.print_msg;

public class Setters {
    public static int setOptionSwitch() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
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
}
