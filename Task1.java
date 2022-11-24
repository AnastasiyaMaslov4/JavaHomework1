import java.util.Scanner;

public class Task1 {

    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
    // n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = iScanner.nextInt();
        System.out.println("Треугольное число для n = " + FindTriangNum(n));
        System.out.println("Факториал n = " + Factorial(n));
        iScanner.close();
    }

    public static int FindTriangNum(int n) {
        int res = n*(n+1)/2;
        return res;
    }

    public static int Factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
           res = res*i;
        }
        return res;
    }
    
}