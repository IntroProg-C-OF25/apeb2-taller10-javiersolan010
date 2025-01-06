
import java.util.Scanner;

/**
 * *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar
 * su procesamiento para presentar los elementos: De la diagonal principal. De
 * la diagonal segundaria. Ubicados bajo la diagonal principal. Ubicados sobre
 * la diagonal principal. Ubicados bajo la diagonal secundaria. Ubicados sobre
 * la diagonal secundaria.
 *
 * @author Javier Solano
 */
public class Ejercicio1_Elementos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Deme el tamanio de la matriz: ");
        tamanioMatriz = tcl.nextInt();
        int matriz[][] = new int[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }

            }
        }
        System.out.println("\nDIAGONAL PRINCIPAL EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDIAGONAL SECUNDARIA OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL SECUNDARIA EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
        }
        System.out.println("\nELEMENTOS ARRIBA DE LA DIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
        }
        System.out.println("\nELEMENTOS ARRIBA DE LA DIAGONAL SECUNDARIA:");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - i - 1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
/***
 * Deme el tamanio de la matriz: 3
  7	2	9	
  3	1	4	
  7	0	5	
  DIAGONAL PRINCIPAL OBVIA
  7	1	5	
  DIAGONAL PRINCIPAL EFICIENTE
  7	1	5	
  DIAGONAL SECUNDARIA OBVIA
  9	1	7	
  DIAGONAL SECUNDARIA EFICIENTE
  9	1	7	
  ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL:
  3	7	0	
  ELEMENTOS ARRIBA DE LA DIAGONAL PRINCIPAL:
  2	9	4	
  ELEMENTOS ARRIBA DE LA DIAGONAL SECUNDARIA:
  7	2	3	
  ELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA:
  4	0	5	BUILD SUCCESSFUL (total time: 2 seconds)
 */
