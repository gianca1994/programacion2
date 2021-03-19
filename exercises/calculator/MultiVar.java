package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiVar {

    static final String msgNumbers = "Enter a number: ";

    public void multiVariable(int opt) {
        Messages messages = new Messages();
        Functions functions = new Functions();
        Menu menuInfoMenu = new Menu();
        Scanner variable = new Scanner(System.in);
        ArrayList<Integer> listNumbers = new ArrayList();

        int[] var = new int[opt + 1];
        int i;

        for (i = 1; i <= opt; i++) {

            messages.print_msg(msgNumbers);
            int num = variable.nextInt();

            var[i] = num;
            listNumbers.add(var[i]);
        }

        // menuInfoMenu.menuInfo(listNumbers);
        // functions.sum(listNumbers);
        // functions.subtraction(listNumbers);
        // functions.multiplication(listNumbers);
        // functions.division(listNumbers);
    }
}