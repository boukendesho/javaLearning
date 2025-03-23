import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator;
        double num1;
        double num2;
        double result = 0;

        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator(+,-,*,/): ");
        operator = scanner.next();

        System.out.print("Enter your second number: ");
        num2 = scanner.nextDouble();

//        System.out.printf("Operator: %s Num1: %.2f Num2: %.2f", operator, num1, num2);

        switch (operator) {
            case "+" -> result = add(num1, num2);
            case "-" -> result = minus(num1, num2);
            case "*" -> result = multi(num1, num2);
            case "/" -> result = divide(num1, num2);
            case null, default -> System.out.printf("Invalid operator %s!\n", operator);
        }

        System.out.printf("Result: %.2f", result);
        scanner.close();
    }

    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static double minus(double n1, double n2) {
        return n1 - n2;
    }

    public static double multi(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("0 can't be divided!");
        }

        return n1 / n2;
    }
}
