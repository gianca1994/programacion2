package calculator;

import java.util.Scanner;

import static calculator.Messages.*;
import static calculator.Functions.*;

public class MultiVar {

    Scanner variable = new Scanner(System.in);


    public void MultVar(int args) {

        int i;
        double sum = 0;
        double result;
        double total = 0;

        for (i = 1; i <= args; i++) {

            int num = setNumber();

            if (i >= args) {
                break;
            } else {
                char operator = setOperator();
                result = result(sum, operator, num);
                total += result;
            }
        }
        print_result(MSG_RESULT, total);
    }

    public int result(double sum, char operator, int num) {
        return (int) (sum + operator + num);
    }

    public char setOperator() {
        print_msg(MSG_OPERATOR);
        return variable.next().charAt(0);
    }

    public int setNumber() {
        print_msg(MSG_NUMBERS);
        return variable.nextInt();
    }
}