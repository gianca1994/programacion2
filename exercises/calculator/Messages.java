package calculator;

public class Messages {
    
    public void msgWelcome(){
        System.out.println("Welcome to the calculator, enter the number of numbers to which you want to apply an operation");
    }

    public void msgFirstNumber(){
        System.out.println("First number:");
    }

    public void msgSecondNumber(){
        System.out.println("Second number:");
    }

    public void msgMenu(){
        System.out.println("Enter the option you want to perform: ");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exit");
    }

    public void msgSum(int val){
        System.out.println("Result of the sum: " + val);
    }

    public void msgSubtrac(int val){
        System.out.println("Result of the subtraction: " + val);
    }

    public void msgmult(int val){
        System.out.println("Multiplication result: " + val);
    }

    public void msgdiv(float val){
        System.out.println("Division result: " + val);
    }
}
