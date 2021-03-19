package calculator;

public class Functions {
    Messages messages = new Messages();

    static final String msgSum = "Result of the sum: ";
    static final String msgSubtrac = "Result of the subtraction: ";
    static final String msgmult = "Multiplication result: ";
    static final String msgdiv = "Division result: ";

    public void sum(int num1, int num2) {
        int resultSum = num1 + num2;
        messages.print_result(msgSum,resultSum);
    }

    public void subtraction(int num1, int num2) {
        int resultSubtraction = num1 - num2;
        messages.print_result(msgSubtrac,resultSubtraction);
    }

    public void multiplication(int num1, int num2) {
        int resultMultiplication = num1 * num2;
        messages.print_result(msgmult,resultMultiplication);
    }

    public void division(float num1, float num2) {
        float resultDivision = num1 / num2;
        messages.print_result_div(msgdiv,resultDivision);
    }
}
