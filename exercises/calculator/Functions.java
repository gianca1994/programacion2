package calculator;

import java.util.Scanner;

import static calculator.Messages.*;


public class Functions {

    public static double doSum(double num1, double num2) {
        return num1 + num2;
    }

    public static double doSubtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double doMultiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double doDivision(double num1, double num2) {
        return num1 / num2;
    }

    public static void sum(double result) {
        print_result(MSG_SUM, result);
    }

    public static void subtraction(double result) {
        print_result(MSG_SUBTRAC, result);
    }

    public static void multiplication(double result) {
        print_result(MSG_MULT, result);
    }

    public static void division(double result) {
        print_result(MSG_DIV, result);
    }

    public static int setOptionSwitch() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void print_msg(String msg) {
        System.out.println(msg);
    }

    public static void print_result(String msg, double val) {
        System.out.println(msg + val);
    }

}
