package resolNizS;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
