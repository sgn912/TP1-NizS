package resolNizS;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Celsius a Fahrenheit");
        System.out.println("2 - Fahrenheit a Celsius");
        int opcion = sc.nextInt();

        System.out.print("Ingrese la temperatura: ");
        double temp = sc.nextDouble();

        if (opcion == 1) {
            double f = (temp * 9 / 5) + 32;
            System.out.println("Resultado: " + f + " °F");
        } else if (opcion == 2) {
            double c = (temp - 32) * 5 / 9;
            System.out.println("Resultado: " + c + " °C");
        } else {
            System.out.println("Opción inválida");
        }
    }
}
