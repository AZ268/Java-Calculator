package cal;

import java.util.Scanner;

public class FinalVer {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = calc.nextDouble();

        System.out.println("Enter the second number");
        double num2 = calc.nextDouble();

        System.out.println("Mathematical task 1='+', 2='-', 3='*', 4='/'");
        char m = calc.next().charAt(0);
        {

            if (m == '1') {
                System.out.println(sum(num1,num2));
            } else if (m == '2') {
                System.out.println(minus(num1,num2));
            } else if (m == '3') {
                System.out.println(multiplication(num1, num2));
            } else if (m == '4') {
                System.out.println(division(num1,num2));
            } else {
                tryAgain();
            }
        }

    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }
    
    public static double minus(double a, double b) {
        double minus = a - b;
        return minus;  
    }
    
    public static double multiplication(double a, double b) {
        double multiplication = a*b;
        return multiplication;
    }
    public static double division (double a, double b) {
        double division= a/b;
        return division;
    }

    private static void tryAgain() {
        
        System.out.println("Try again!");    }

}
