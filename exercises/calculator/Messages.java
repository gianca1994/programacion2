package calculator;

public class Messages {

    public void print_msg(String msg){
        System.out.println(msg);
    }

    public void print_result(String msg, double val){
        System.out.println(msg + val);
    }

    final String menu = """
            Enter the option you want to perform:\s
            1- Sum
            2- Subtraction
            3- Multiplication
            4- Division
            5- Exit""";

    final String msgSum = "Result of the sum: ", msgSubtrac = "Result of the subtraction: ",
            msgmult = "Multiplication result: ", msgdiv = "Division result: ";

    final String welcome = "Welcome to the calculator, enter the number " +
            "of numbers to which you want to apply an operation",
            firstNumber = "First number:", secondNumber = "Second number:";
}
