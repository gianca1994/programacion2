package calculator;
import java.util.Scanner;

public class Menu {
    public void menuInfo(int number1, int number2) {

        Scanner variable = new Scanner(System.in);
        Functions function = new Functions();
        Messages messages = new Messages();

        messages.msgMenu();

        int opt = variable.nextInt();

        switch (opt) {
            case 1:
                function.sum(number1, number2);
                break;

            case 2:
                function.subtraction(number1, number2);
                break;

            case 3:
                function.multiplication(number1, number2);
                break;

            case 4:
                function.division(number1, number2);
                break;

            case 5:
                break;
        }
    }
}
