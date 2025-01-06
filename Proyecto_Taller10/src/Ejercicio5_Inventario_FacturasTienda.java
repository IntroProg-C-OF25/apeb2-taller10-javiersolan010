
import java.util.Scanner;

/**
 * *
 * Crea un programa que gestione el inventario de una tienda, así como la
 * emisión de facturas. Utiliza una matriz bidimensional para almacenar los
 * productos disponibles en la tienda, con información como nombre, precio y
 * cantidad. El programa debe permitir facturar un producto dado su código, y
 * unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y
 * si la compra superar los $100, se debe aplicar un descuento.
 *
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso,
 * muestre la alerta respectiva.
 *
 * @author Javier Solano
 */
public class Ejercicio5_Inventario_FacturasTienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matriz para almacenar los productos: código, nombre, precio y cantidad
        String[][] inventario = {
            {"1", "Camisa", "20", "50"},
            {"2", "Pantalon", "25", "30"},
            {"3", "Zapatos", "50", "20"},
            {"4", "Sombrero", "15", "10"},
            {"5", "Chaqueta", "40", "5"}
        };

        int opcion;
        do {
            System.out.println("\nMenu de Gestion de Inventario y Facturacion:");
            System.out.println("1. Facturar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del producto que desea comprar: ");
                    String codigo = scanner.nextLine();

                    // Buscar el producto por código
                    int index = -1;
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0].equals(codigo)) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Producto no encontrado.");
                        break;
                    }

                    String nombreProducto = inventario[index][1];
                    double precioProducto = Double.parseDouble(inventario[index][2]);
                    int cantidadDisponible = Integer.parseInt(inventario[index][3]);

                    System.out.print("Ingrese la cantidad que desea comprar: ");
                    int cantidadCompra = scanner.nextInt();

                    if (cantidadCompra > cantidadDisponible) {
                        System.out.println("No hay suficientes existencias. Solo hay " + cantidadDisponible + " unidades disponibles.");
                        break;
                    }

                    double subtotal = cantidadCompra * precioProducto;
                    double iva = subtotal * 0.15;
                    double total = subtotal + iva;

                    // Aplicar descuento si la compra supera los $100
                    if (total > 100) {
                        double descuento = total * 0.10;
                        total -= descuento;
                        System.out.println("¡Descuento del 10% aplicado!");
                    }

                    inventario[index][3] = String.valueOf(cantidadDisponible - cantidadCompra);

                    System.out.println("\nFactura:");
                    System.out.println("Producto: " + nombreProducto);
                    System.out.println("Cantidad: " + cantidadCompra);
                    System.out.println("Precio unitario: $" + precioProducto);
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("IVA (15%): $" + iva);
                    System.out.println("Total a pagar: $" + total);
                    break;

                case 2:

                    System.out.println("\nInventario de la tienda:");
                    for (int i = 0; i < inventario.length; i++) {
                        System.out.println("Codigo: " + inventario[i][0] + ", Producto: " + inventario[i][1]
                                + ", Precio: $" + inventario[i][2] + ", Existencias: " + inventario[i][3]);
                    }
                    break;

                case 3:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
/***
 * Menu de Gestion de Inventario y Facturacion:
1. Facturar producto
2. Mostrar inventario
3. Salir
Seleccione una opcion: 2

Inventario de la tienda:
Codigo: 1, Producto: Camisa, Precio: $20, Existencias: 50
Codigo: 2, Producto: Pantalon, Precio: $25, Existencias: 30
Codigo: 3, Producto: Zapatos, Precio: $50, Existencias: 20
Codigo: 4, Producto: Sombrero, Precio: $15, Existencias: 10
Codigo: 5, Producto: Chaqueta, Precio: $40, Existencias: 5

Menu de Gestion de Inventario y Facturacion:
1. Facturar producto
2. Mostrar inventario
3. Salir
Seleccione una opcion: 1
Ingrese el codigo del producto que desea comprar: 4
Ingrese la cantidad que desea comprar: 3

Factura:
Producto: Sombrero
Cantidad: 3
Precio unitario: $15.0
Subtotal: $45.0
IVA (15%): $6.75
Total a pagar: $51.75

Menu de Gestion de Inventario y Facturacion:
1. Facturar producto
2. Mostrar inventario
3. Salir
Seleccione una opcion: 1
Ingrese el codigo del producto que desea comprar: 2
Ingrese la cantidad que desea comprar: 3

Factura:
Producto: Pantalon
Cantidad: 3
Precio unitario: $25.0
Subtotal: $75.0
IVA (15%): $11.25
Total a pagar: $86.25

Menu de Gestion de Inventario y Facturacion:
1. Facturar producto
2. Mostrar inventario
3. Salir
Seleccione una opcion: 1
Ingrese el codigo del producto que desea comprar: 5
Ingrese la cantidad que desea comprar: 2

Factura:
Producto: Chaqueta
Cantidad: 2
Precio unitario: $40.0
Subtotal: $80.0
IVA (15%): $12.0
Total a pagar: $92.0

Menu de Gestion de Inventario y Facturacion:
1. Facturar producto
2. Mostrar inventario
3. Salir
Seleccione una opcion: 3
Hasta luego!
BUILD SUCCESSFUL (total time: 2 minutes 2 seconds)
 */
