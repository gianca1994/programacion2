package calculator;

import java.util.ArrayList;

public class Functions {
    Messages messages = new Messages();

    static final String msgSum = "Result of the sum: ", msgSubtrac = "Result of the subtraction: ",
            msgmult = "Multiplication result: ", msgdiv = "Division result: ";


    double sum ,resultSubtraction, resultMultiplication, resultDivision;

    public void sum(double num1, double num2) {
        resultSubtraction = num1 + num2;
        messages.print_result(msgSum,resultSubtraction);
    }

    public void subtraction(double num1, double num2) {
        resultSubtraction = num1 - num2;
        messages.print_result(msgSubtrac,resultSubtraction);
    }

    public void multiplication(double num1, double num2) {
        resultMultiplication = num1 * num2;
        messages.print_result(msgmult,resultMultiplication);
    }

    public void division(double num1, double num2) {
        resultDivision = num1 / num2;
        messages.print_result(msgdiv,resultDivision);
    }

/*
    public void sum(ArrayList<Integer> args) {
        int sum = 0;
        for (int arg : args) {
            sum = (sum + arg);
        }
        messages.print_result(msgSum, sum);
    }

    public void subtraction(ArrayList<Integer> args) {
        int subtrac = 0;
        int first_number = args.get(0);

        for (int arg : args) {
            subtrac = (first_number - arg);
        }
        messages.print_result(msgSubtrac, subtrac);
    }

    public void multiplication(ArrayList<Integer> args) {
        int mult = 1;
        for (int arg : args) {
            mult = mult * arg;
        }
        messages.print_result(msgmult, mult);
    }

    public void division(ArrayList<Integer> args) {
        int div = 0;
        int first_num = args.get(0);

        for (int arg : args) {
            div = first_num / arg;
        }
        messages.print_result(msgdiv, div);
    }
*/
}
