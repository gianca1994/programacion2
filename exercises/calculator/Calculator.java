package calculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Menu menuInfoMenu = new Menu();
        Messages messages = new Messages();
        MultiVar multivar = new MultiVar();
        Scanner variable = new Scanner(System.in);
        int num1, num2, num_of_numbers;

        messages.msgWelcome();

        num_of_numbers = variable.nextInt();

        if (num_of_numbers > 2) {
            multivar.multiVariable(num_of_numbers);
        } else {
            messages.msgFirstNumber();
            num1 = variable.nextInt();

            messages.msgSecondNumber();
            num2 = variable.nextInt();

            menuInfoMenu.menuInfo(num1, num2);
        }
    }
}

class MultiVar {

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


