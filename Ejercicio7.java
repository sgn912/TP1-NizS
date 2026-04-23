package resolNizS;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("0 - Salir");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese A: ");
                int a = sc.nextInt();
                System.out.print("Ingrese B: ");
                int b = sc.nextInt();

                System.out.println(opcion == 1 ? a + b : a - b);
            }

        } while (opcion != 0);
    }
}
