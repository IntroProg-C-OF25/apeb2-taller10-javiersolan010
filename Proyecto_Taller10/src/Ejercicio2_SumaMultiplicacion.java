import java.util.Scanner;
/***
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros
 * aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 *
 * @author Javier Solano
 */
public class Ejercicio2_SumaMultiplicacion {

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

            
            System.out.print("Ingrese el numero de filas para la Matriz A: ");
            int filasA = scanner.nextInt();
            System.out.print("Ingrese el numero de columnas para la Matriz A: ");
            int columnasA = scanner.nextInt();

            System.out.print("Ingrese el numero de filas para la Matriz B: ");
            int filasB = scanner.nextInt();
            System.out.print("Ingrese el numero de columnas para la Matriz B: ");
            int columnasB = scanner.nextInt();

            
            int[][] matrizA = new int[filasA][columnasA];
            int[][] matrizB = new int[filasB][columnasB];

            // Llenar matrices con números aleatorios
            System.out.println("Llenando la Matriz A...");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizA[i][j] = (int) (Math.random() * 10);
                }
            }

            System.out.println("Llenando la Matriz B...");
            for (int i = 0; i < filasB; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizB[i][j] = (int) (Math.random() * 10);
                }
            }

            
            System.out.println("Matriz A:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    System.out.print(matrizA[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("");

            
            System.out.println("Matriz B:");
            for (int i = 0; i < filasB; i++) {
                for (int j = 0; j < columnasB; j++) {
                    System.out.print(matrizB[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("");

            
            if (filasA == filasB && columnasA == columnasB) {
                System.out.println("Suma de las matrices:");
                int[][] sumaMatrices = new int[filasA][columnasA];
                for (int i = 0; i < filasA; i++) {
                    for (int j = 0; j < columnasA; j++) {
                        sumaMatrices[i][j] = matrizA[i][j] + matrizB[i][j];
                        System.out.print(sumaMatrices[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Las matrices no se pueden sumar porque tienen dimensiones diferentes.");
            }

            System.out.println("");

            
            if (columnasA == filasB) {
                System.out.println("Multiplicacion de las matrices:");
                int[][] multiplicacionMatrices = new int[filasA][columnasB];
                for (int i = 0; i < filasA; i++) {
                    for (int j = 0; j < columnasB; j++) {
                        multiplicacionMatrices[i][j] = 0;
                        for (int k = 0; k < columnasA; k++) {
                            multiplicacionMatrices[i][j] += matrizA[i][k] * matrizB[k][j];
                        }
                        System.out.print(multiplicacionMatrices[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Las matrices no se pueden multiplicar debido a que sus dimensiones son incompatibles.");
            }
        }
    }
