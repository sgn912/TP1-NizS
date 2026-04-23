package resol.NizS.ejercicio1;

import java.util.*;

public class Ejercicio1 {
    public static void ejecutar() {
        Catalogo catalogo = new Catalogo();
        catalogo.cargarEjemplo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Catálogo:");
        catalogo.mostrar();

        System.out.print("Seleccione una prenda por índice: ");
        int indice = scanner.nextInt();
        Prenda prenda = catalogo.seleccionar(indice);

        System.out.print("¿Tiene cupón de descuento? (s/n): ");
        boolean tieneCupon = scanner.next().equalsIgnoreCase("s");

        System.out.print("¿Pago al contado o en cuotas? (1 = contado, 2 = cuotas): ");
        int metodoPago = scanner.nextInt();

        int cuotas = 1;
        if (metodoPago == 2) {
            System.out.print("Ingrese cantidad de cuotas: ");
            cuotas = scanner.nextInt();
        }

        Compra compra = new Compra(prenda, metodoPago == 1, cuotas, tieneCupon);
        compra.mostrarResumen();
    }
}

class Prenda {
    String tipo;
    double precio;
    String talle;

    public Prenda(String tipo, double precio, String talle) {
        this.tipo = tipo;
        this.precio = precio;
        this.talle = talle;
    }
}

class Catalogo {
    List<Prenda> prendas = new ArrayList<>();

    void cargarEjemplo() {
        prendas.add(new Prenda("Camisa", 15000, "M"));
        prendas.add(new Prenda("Pantalón", 20000, "L"));
        prendas.add(new Prenda("Zapatillas", 30000, "42"));
    }

    void mostrar() {
        for (int i = 0; i < prendas.size(); i++) {
            Prenda p = prendas.get(i);
            System.out.println(i + ": " + p.tipo + " - Talle: " + p.talle + " - Precio: $" + p.precio);
        }
    }

    Prenda seleccionar(int indice) {
        return prendas.get(indice);
    }
}

class Compra {
    Prenda prenda;
    boolean contado;
    int cuotas;
    boolean cupon;

    public Compra(Prenda prenda, boolean contado, int cuotas, boolean cupon) {
        this.prenda = prenda;
        this.contado = contado;
        this.cuotas = cuotas;
        this.cupon = cupon;
    }

    public void mostrarResumen() {
        double precio = prenda.precio;
        double descuentoContado = 0;
        double descuentoCupon = 0;
        double recargo = 0;

        if (contado) {
            descuentoContado = precio * 0.15;
        } else {
            if (cuotas > 12) recargo = precio * 0.12;
            else if (cuotas > 6) recargo = precio * 0.08;
            else if (cuotas > 3) recargo = precio * 0.05;
        }

        if (cupon) {
            if (contado) {
                descuentoCupon = (precio - descuentoContado) * 0.10;
            } else {
                descuentoCupon = precio * 0.10;
            }
        }

        double finalPrice = precio - descuentoContado + recargo - descuentoCupon;

        System.out.println("\nResumen de Compra:");
        System.out.println("Prenda: " + prenda.tipo + ", Talle: " + prenda.talle);
        System.out.println("Precio base: $" + precio);
        System.out.println("Pago: " + (contado ? "Contado" : "Cuotas"));
        if (contado) System.out.println("Descuento contado: $" + descuentoContado);
        else {
            System.out.println("Cuotas: " + cuotas);
            System.out.println("Recargo: $" + recargo);
        }
        if (cupon) System.out.println("Descuento cupón: $" + descuentoCupon);
        System.out.println("Precio final: $" + finalPrice);
    }
}