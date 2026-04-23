package resolNizS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TP1 ===");
        System.out.println("1 - Programa Saludador");
        System.out.println("2 - Número Par");
        System.out.println("3 - Tabla de Multiplicar");
        System.out.println("4 - Contar Vocales");
        System.out.println("5 - Palíndromo");
        System.out.println("6 - Adivina el Número");
        System.out.println("7 - Menú Interactivo");
        System.out.print("Elija una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar(args);
            case 2 -> Ejercicio2.ejecutar(args);
            case 3 -> Ejercicio3.ejecutar();
            case 4 -> Ejercicio4.ejecutar();
            case 5 -> Ejercicio5.ejecutar();
            case 6 -> Ejercicio6.ejecutar();
            case 7 -> Ejercicio7.ejecutar();
            default -> System.out.println("Opción inválida");
        }
    }
}
