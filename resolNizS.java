package resolNizS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TP1 ===");
        System.out.println("1 - Programa saludador");
        System.out.println("2 - Numero par");
        System.out.println("3 - Tabla de multiplicar");
        System.out.println("4 - Contar vocales");
        System.out.println("5 - Palindromo");
        System.out.println("6 - Adivina el numero");
        System.out.println("7 - Menu interactivo");
        System.out.println("8 - Conversor de temperatura");
        System.out.println("9 - Cuenta palabras");
        System.out.println("10 - Validar contraseña segura");
        System.out.println("11 - Fibonacci");
        System.out.println("12 - Arreglo unidimensional");
        System.out.println("13 - Nota de estudiantes");
        System.out.println("14 - Quitar ceros");
        System.out.print("Elija una opcion: ");

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
            case 8 -> Ejercicio8.ejecutar();
            case 9 -> Ejercicio9.ejecutar();
            case 10 -> Ejercicio10.ejecutar();
            case 11 -> Ejercicio11.ejecutar();
            case 12 -> Ejercicio12.ejecutar();
            case 13 -> Ejercicio13.ejecutar();
            case 14 -> Ejercicio14.ejecutar();
            default -> System.out.println("Opción inválida");
        }
    }
}
