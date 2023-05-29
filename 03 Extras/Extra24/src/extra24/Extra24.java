package extra24;

import java.util.Scanner;


public class Extra24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el largo de la sucesión: ");
        int n = input.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("La sucesión de Fibonacci con " + n + " términos es:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    /* Con Recursión
    public static void main(String[] args) {
        int cantidad = 10;
        System.out.println("Secuencia de Fibonacci hasta " + cantidad + ":");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    */
}