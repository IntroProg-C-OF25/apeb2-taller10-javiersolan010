
import java.util.Scanner;

/**
 * *
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 * Permita a dos jugadores marcar sus movimientos alternativamente. El juego
 * debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 *
 * @author Javier Solano
 */
public class Ejercicio6_TresEnRaya {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        char jugadorActual = 'X'; // El primer jugador es 'X'
        boolean juegoTerminado = false;

        while (!juegoTerminado) {

            System.out.println("\nTablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---------");
                }
            }

            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            int columna = scanner.nextInt();

            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;

                boolean haGanado = false;

                for (int i = 0; i < 3; i++) {
                    if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual)
                            || (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                        haGanado = true;
                        break;
                    }
                }

                if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual)
                        || (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                    haGanado = true;
                }

                if (haGanado) {

                    System.out.println("\nTablero:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tablero[i][j]);
                            if (j < 2) {
                                System.out.print(" | ");
                            }
                        }
                        System.out.println();
                        if (i < 2) {
                            System.out.println("---------");
                        }
                    }
                    System.out.println(" El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else {

                    boolean empate = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (tablero[i][j] == ' ') {
                                empate = false;
                                break;
                            }
                        }
                        if (!empate) {
                            break;
                        }
                    }
                    if (empate) {

                        System.out.println("\nTablero:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(tablero[i][j]);
                                if (j < 2) {
                                    System.out.print(" | ");
                                }
                            }
                            System.out.println();
                            if (i < 2) {
                                System.out.println("---------");
                            }
                        }
                        System.out.println(" Es un empate!");
                        juegoTerminado = true;
                    } else {

                        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("La celda ya esta ocupada, intente nuevamente.");
            }
        }
        scanner.close();
    }
}
/***
 * Tablero:
  |   |  
---------
  |   |  
---------
  |   |  
Turno del jugador X
Ingrese la fila (0-2): 0
Ingrese la columna (0-2): 2

Tablero:
  |   | X
---------
  |   |  
---------
  |   |  
Turno del jugador O
Ingrese la fila (0-2): 2
Ingrese la columna (0-2): 1

Tablero:
  |   | X
---------
  |   |  
---------
  | O |  
Turno del jugador X
Ingrese la fila (0-2): 2
Ingrese la columna (0-2): 0

Tablero:
  |   | X
---------
  |   |  
---------
X | O |  
Turno del jugador O
Ingrese la fila (0-2): 1
Ingrese la columna (0-2): 1

Tablero:
  |   | X
---------
  | O |  
---------
X | O |  
Turno del jugador X
Ingrese la fila (0-2): 1
Ingrese la columna (0-2): 0

Tablero:
  |   | X
---------
X | O |  
---------
X | O |  
Turno del jugador O
Ingrese la fila (0-2): 2
Ingrese la columna (0-2): 1
La celda ya esta ocupada, intente nuevamente.

Tablero:
  |   | X
---------
X | O |  
---------
X | O |  
Turno del jugador O
Ingrese la fila (0-2): 0
Ingrese la columna (0-2): 1

Tablero:
  | O | X
---------
X | O |  
---------
X | O |  
 El jugador O ha ganado!
BUILD SUCCESSFUL (total time: 48 seconds)
 */
