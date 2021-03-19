package calculator;

import java.util.Scanner;

public class MultiVar {

    public void multiVariable(int opt) {
        Scanner variable = new Scanner(System.in);

        int i = 0;
        while (true) {

            i++;

            int num = variable.nextInt();
            System.out.println(num);

            if (i == opt) {
                break;
            }
        }
    }
}