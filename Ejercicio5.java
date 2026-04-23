package resolNizS;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
