package resolNizS;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println("Ordenados de mayor a menor:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
