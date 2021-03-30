package calculator;

import static calculator.Messages.*;

public class Functions {

    double resultSum, resultSubtraction, resultMultiplication, resultDivision;

    public void sum(double num1, double num2) {
        resultSum = num1 + num2;
        print_result(MSG_SUM, resultSum);
    }

    public void subtraction(double num1, double num2) {
        resultSubtraction = num1 - num2;
        print_result(MSG_SUBTRAC, resultSubtraction);
    }

    public void multiplication(double num1, double num2) {
        resultMultiplication = num1 * num2;
        print_result(MSG_MULT, resultMultiplication);
    }

    public void division(double num1, double num2) {
        resultDivision = num1 / num2;
        print_result(MSG_DIV, resultDivision);
    }
}
