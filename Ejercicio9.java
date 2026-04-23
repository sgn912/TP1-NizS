package resolNizS;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine().trim();

        if (texto.isEmpty()) {
            System.out.println("Cantidad de palabras: 0");
            return;
        }

        String[] palabras = texto.split("[\\s.,;:]+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }
}
