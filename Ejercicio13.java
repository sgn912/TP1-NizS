package resolNizS;

public class Ejercicio13 {
    public static void ejecutar() {
        String[] nombres = {"Santy", "Franco", "Pablo"};

        double[][] notas = {
            {7, 8, 6},
            {9, 7, 8},
            {6, 6, 7}
        };

        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 3;
            System.out.println(nombres[i] + " - Promedio: " + promedio);
        }
    }
}
