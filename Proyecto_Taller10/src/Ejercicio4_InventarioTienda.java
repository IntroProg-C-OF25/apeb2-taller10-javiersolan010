import java.util.Scanner;
/**
 * *
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz
 * bidimensional para almacenar los productos disponibles en la tienda, con
 * información como nombre, precio y cantidad. El programa debe permitir agregar
 * nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 *
 * @author Javier Solano
 */
public class Ejercicio4_InventarioTienda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[10][3]; // 10 productos, 3 columnas: nombre, precio, cantidad
        int opcion;

        do {
            System.out.println("\nMenu de Gestion de Inventario:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: // Agregar producto
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    String precio = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    String cantidad = scanner.nextLine();

                    boolean agregado = false;
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0] == null) {
                            inventario[i][0] = nombre;
                            inventario[i][1] = precio;
                            inventario[i][2] = cantidad;
                            agregado = true;
                            System.out.println("Producto agregado con exito.");
                            break;
                        }
                    }
                    if (!agregado) {
                        System.out.println("Inventario lleno. No se pueden agregar mas productos.");
                    }
                    break;

                case 2: // Actualizar existencias
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    nombre = scanner.nextLine();

                    boolean encontradoActualizar = false;
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombre)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            cantidad = scanner.nextLine();
                            inventario[i][2] = cantidad;
                            encontradoActualizar = true;
                            System.out.println("Existencias actualizadas con éxito.");
                            break;
                        }
                    }
                    if (!encontradoActualizar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3: // Buscar producto
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nombre = scanner.nextLine();

                    boolean encontradoBuscar = false;
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombre)) {
                            System.out.println("Producto encontrado: ");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            encontradoBuscar = true;
                            break;
                        }
                    }
                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4: // Eliminar producto
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = scanner.nextLine();

                    boolean encontradoEliminar = false;
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombre)) {
                            inventario[i][0] = null;
                            inventario[i][1] = null;
                            inventario[i][2] = null;
                            encontradoEliminar = true;
                            System.out.println("Producto eliminado con exito.");
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5: // Mostrar inventario
                    boolean productosPresentes = false;
                    System.out.println("Inventario actual:");
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i][0] != null) {
                            System.out.println("Producto " + (i + 1) + ": ");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            System.out.println();
                            productosPresentes = true;
                        }
                    }
                    if (!productosPresentes) {
                        System.out.println("No hay productos en el inventario.");
                    }
                    break;

                case 6: 
                    System.out.println(" Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
/***
 * Menu de Gestion de Inventario:
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: Leche
Ingrese el precio del producto: 3
Ingrese la cantidad del producto: 2
Producto agregado con exito.

Menu de Gestion de Inventario:
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: Azucar
Ingrese el precio del producto: 4
Ingrese la cantidad del producto: 2
Producto agregado con exito.

Menu de Gestion de Inventario:
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 1
Ingrese el nombre del producto: Sal
Ingrese el precio del producto: 2
Ingrese la cantidad del producto: 1
Producto agregado con exito.

Menu de Gestion de Inventario:
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opcion: 5
Inventario actual:
Producto 1: 
Nombre: Leche
Precio: 3
Cantidad: 2

Producto 2: 
Nombre: Azucar
Precio: 4
Cantidad: 2

Producto 3: 
Nombre: Sal
Precio: 2
Cantidad: 1

 */
