package resolNizS;

public class Ejercicio1 {
    public static void ejecutar(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe ingresar un nombre");
            return;
        }
        System.out.println("Hola " + args[0] + "!");
    }
}
