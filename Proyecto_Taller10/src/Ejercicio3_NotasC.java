import java.util.Scanner;
/**
 * *
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al
 * finalizar el periodo, la Dirección de la carrera de Computación a solicitado
 * las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en
 * función a los promedios por estudiante, dichos promedios se deben calcular
 * (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un
 * peso del 30%). En resumen, los requerimientos son los siguientes: Registre
 * los nombres de cada estudiante de dicho paralelo. Genere aleatoriamente las
 * notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts. Calcule
 * el promedio de cada uno de los estudiantes del paralelo dada la siguiente
 * ponderación: ACD->35%, APE->35%, y el AA->30%. Obtenga el promedio del curso,
 * del paralelo C. Liste los nombres de los estudiantes y su nota, que hayan
 * obtenido un promedio por encima del promedio del curso. Liste los nombres de
 * los estudiantes y su nota, que hayan obtenido un promedio por debajo del
 * promedio del curso. Muestre el estudiante con su calificación, si es el del
 * mayor promedio (el más alto de la clase). Muestre el estudiante con su
 * calificación, si es el del menor promedio (el más bajo de la clase
 *
 * @author Javier Solano
 */
public class Ejercicio3_NotasC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[28];  
        double[] ACD = new double[28];      
        double[] APE = new double[28];      
        double[] AA = new double[28];       
        double[] promedios = new double[28]; 

        // Generar nombres de los estudiantes
        for (int i = 0; i < 28; i++) {
            nombres[i] = "Estudiante " + (i + 1); 
        }

        // Simular las notas aleatorias de ACD, APE y AA entre 0 y 10
        for (int i = 0; i < 28; i++) {
            ACD[i] = Math.random() * 10;  
            APE[i] = Math.random() * 10;
            AA[i] = Math.random() * 10;
        }

        double sumaTotal = 0;
        for (int i = 0; i < 28; i++) {
            promedios[i] = ACD[i] * 0.35 + APE[i] * 0.35 + AA[i] * 0.30;
            sumaTotal += promedios[i];
        }

        double promedioCurso = sumaTotal / 28;
        System.out.printf("Promedio del curso: %.2f\n", promedioCurso);
        
        System.out.println("\nEstudiantes con promedio por encima del promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.printf("%s - Promedio: %.2f\n", nombres[i], promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con promedio por debajo del promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.printf("%s - Promedio: %.2f\n", nombres[i], promedios[i]);
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < 28; i++) {
            if (promedios[i] > promedios[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.printf("\nEstudiante con el mayor promedio: %s - Promedio: %.2f\n", nombres[maxIndex], promedios[maxIndex]);

        int minIndex = 0;
        for (int i = 1; i < 28; i++) {
            if (promedios[i] < promedios[minIndex]) {
                minIndex = i;
            }

        }
    }
}
/***
 * Promedio del curso: 5,04

Estudiantes con promedio por encima del promedio del curso:
Estudiante 4 - Promedio: 8,33
Estudiante 8 - Promedio: 6,22
Estudiante 9 - Promedio: 7,55
Estudiante 12 - Promedio: 7,43
Estudiante 13 - Promedio: 5,23
Estudiante 14 - Promedio: 8,46
Estudiante 16 - Promedio: 5,34
Estudiante 17 - Promedio: 8,60
Estudiante 19 - Promedio: 6,58
Estudiante 23 - Promedio: 8,07
Estudiante 25 - Promedio: 5,74
Estudiante 28 - Promedio: 6,46

Estudiantes con promedio por debajo del promedio del curso:
Estudiante 1 - Promedio: 5,00
Estudiante 2 - Promedio: 2,36
Estudiante 3 - Promedio: 3,85
Estudiante 5 - Promedio: 1,49
Estudiante 6 - Promedio: 4,26
Estudiante 7 - Promedio: 4,06
Estudiante 10 - Promedio: 4,29
Estudiante 11 - Promedio: 2,46
Estudiante 15 - Promedio: 1,51
Estudiante 18 - Promedio: 3,97
Estudiante 20 - Promedio: 3,88
Estudiante 21 - Promedio: 3,57
Estudiante 22 - Promedio: 3,97
Estudiante 24 - Promedio: 4,93
Estudiante 26 - Promedio: 3,88
Estudiante 27 - Promedio: 3,69

Estudiante con el mayor promedio: Estudiante 17 - Promedio: 8,60
BUILD SUCCESSFUL (total time: 0 seconds)
 */
