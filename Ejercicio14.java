package resolNizS;

import java.util.ArrayList;

public class Ejercicio14 {

    public static void mostrar(int[][] m) {
        for (int[] fila : m) {
            for (int n : fila) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void ejecutar() {
        int[][] original = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(original);

        ArrayList<int[]> filas = new ArrayList<>();

        for (int[] fila : original) {
            ArrayList<Integer> aux = new ArrayList<>();
            for (int n : fila) {
                if (n != 0) aux.add(n);
            }
            if (!aux.isEmpty()) {
                int[] nueva = new int[aux.size()];
                for (int i = 0; i < aux.size(); i++) {
                    nueva[i] = aux.get(i);
                }
                filas.add(nueva);
            }
        }

        int[][] resultado = filas.toArray(new int[0][]);

        System.out.println("\nArreglo sin ceros:");
        mostrar(resultado);
    }
}
