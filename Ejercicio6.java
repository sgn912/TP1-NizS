package resolNizS;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = r.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el numero (1-100): ");
            intento = sc.nextInt();

            if (intento > numero)
                System.out.println("Mas bajo");
            else if (intento < numero)
                System.out.println("Mas alto");

        } while (intento != numero);

        System.out.println("¡Correcto!");
    }
}
