/*
 • Generar el reporte mostrado.
 • Utilizar arreglos paralelos inicializados​.
 • Calcular promedio por alumno y promedio total
 • Los datos deben calcularse a partir de una copia de los arreglos paralelos​.
 • El reporte ASCII debe generarse haciendo uso de StringBuilder.append()
 */
package Ejercicios;

import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        // Arreglos paralelos inicializados
        String[] nombres = {"Ana", "Carlos", "Beatriz", "Daniel"};
        double[][] calificaciones = {
            {85, 90, 78},
            {76, 88, 90},
            {92, 89, 85},
            {70, 75, 80}
        };

        // Crear copias de los arreglos para cálculos
        String[] nombresCopia = Arrays.copyOf(nombres, nombres.length);
        double[][] calificacionesCopia = Arrays.copyOf(calificaciones, calificaciones.length);

        // Calcular promedios por alumno y promedio total
        double[] promedios = new double[nombresCopia.length];
        double sumaTotal = 0;
        int totalNotas = 0;

        for (int i = 0; i < nombresCopia.length; i++) {
            double suma = 0;
            for (double nota : calificacionesCopia[i]) {
                suma += nota;
                sumaTotal += nota;
                totalNotas++;
            }
            promedios[i] = suma / calificacionesCopia[i].length;
        }

        double promedioTotal = sumaTotal / totalNotas;

        // Construcción del reporte ASCII con StringBuilder
        StringBuilder reporte = new StringBuilder();
        reporte.append("====================================\n");
        reporte.append("        REPORTE DE NOTAS           \n");
        reporte.append("====================================\n");
        reporte.append(String.format("%-10s %-10s %-10s %-10s %-10s\n", "Alumno", "Nota 1", "Nota 2", "Nota 3", "Promedio"));
        reporte.append("------------------------------------\n");

        for (int i = 0; i < nombresCopia.length; i++) {
            reporte.append(String.format("%-10s %-10.2f %-10.2f %-10.2f %-10.2f\n",
                    nombresCopia[i], calificacionesCopia[i][0], calificacionesCopia[i][1], calificacionesCopia[i][2], promedios[i]));
        }

        reporte.append("------------------------------------\n");
        reporte.append(String.format("Promedio total: %.2f\n", promedioTotal));
        reporte.append("====================================\n");

        // Mostrar el reporte
        System.out.println(reporte.toString());
    }
}