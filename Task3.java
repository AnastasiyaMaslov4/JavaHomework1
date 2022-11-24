import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println(" ");
        System.out.print("Введите операцию(+ - * /): ");
        String operand = iScanner.next();
        System.out.println(" ");
        System.out.print("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        if (operand.equals("+")) {
            Sum(a, b);
        }
        else if(operand.equals("-")) {
            Min(a, b);
        }
        else if(operand.equals("*")) {
            Mul(a, b);
        }
        else if(operand.equals("/")) {
            Div(a, b);
        }
        else {
            System.out.print("Операнда не распознана, попробуйте еще раз.");
        }
    }

    public static void Sum(int a, int b) {
        int res = a + b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
    }

    public static void Min(int a, int b) {
        int res = a - b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
    }

    public static void Mul(int a, int b) {
        int res = a * b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
    }

    public static void Div(int a, int b) {
        int res = a / b;
        System.out.println(" ");
        System.out.println("Результат: " + res);
    }
}
