package sample;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 10;

        int result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        result = num1 - num2;
        System.out.println("num1 - num2 = " + result);

        result = num1 * num2;
        System.out.println("num1 * num2 = " + result);

        result = num1 / num2;
        System.out.println("num1 / num2 = " + result);

        result = num1 % num2;
        System.out.println("num1 % num2 = " + result);
        
        System.out.println("num1 + num2 = " + (num1 + num2));
    }

}
