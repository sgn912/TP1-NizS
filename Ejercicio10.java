package resolNizS;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String pass = sc.nextLine();

        int may = 0, min = 0, dig = 0;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) may++;
            else if (Character.isLowerCase(c)) min++;
            else if (Character.isDigit(c)) dig++;
        }

        if (pass.length() >= 8 && may >= 2 && min >= 3 && dig >= 2) {
            System.out.println("Contraseña segura");
        } else {
            System.out.println("Contraseña NO segura");
        }
    }
}
