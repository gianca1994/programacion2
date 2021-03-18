package calculator;

public class Functions {
    Messages messages = new Messages();

    public void sum(int num1, int num2) {
        int resultSum = num1 + num2;
        messages.msgSum(resultSum);
    }

    public void subtraction(int num1, int num2) {
        int resultSubtraction = num1 - num2;
        messages.msgSubtrac(resultSubtraction);
    }

    public void multiplication(int num1, int num2) {
        int resultMultiplication = num1 * num2;
        messages.msgmult(resultMultiplication);
    }

    public void division(float num1, float num2) {
        float resultDivision = num1 / num2;
        messages.msgdiv(resultDivision);
    }
}
