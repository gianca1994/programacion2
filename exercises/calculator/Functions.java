package calculator;

public class Functions {
    Messages messages = new Messages();

    static final String msgSum = "Result of the sum: ", msgSubtrac = "Result of the subtraction: ",
            msgmult = "Multiplication result: ", msgdiv = "Division result: ";


    double resultSum, resultSubtraction, resultMultiplication, resultDivision;

    public void sum(double num1, double num2) {
        resultSum = num1 + num2;
        messages.print_result(msgSum,resultSum);
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
}
