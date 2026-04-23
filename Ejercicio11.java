package resolNizS;

import java.util.Scanner;

public class Ejercicio11 {

    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
