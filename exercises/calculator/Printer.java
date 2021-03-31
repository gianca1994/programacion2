package calculator;

import static calculator.Messages.MENU_SELECT;
import static calculator.Messages.WELCOME;

public class Printer {

    public static void print_msg(String msg) {
        System.out.println(msg);
    }
    public static void print_result(String msg, double val) {
        System.out.println(msg + val);
    }
    public static void showIntroText() {
        print_msg(WELCOME);
        print_msg(MENU_SELECT);
    }
}
