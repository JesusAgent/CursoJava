/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author ztwen
 */
import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 4, 7},
            {1, 3, 8},
            {2, 9, 6}
        };

        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);

        // Ordenar por fila
        int[][] matrizFila = ordenarPorFila(matriz);
        System.out.println("\nMatriz Ordenada por Fila:");
        imprimirMatriz(matrizFila);

        // Ordenar por columna
        int[][] matrizColumna = ordenarPorColumna(matriz);
        System.out.println("\nMatriz Ordenada por Columna:");
        imprimirMatriz(matrizColumna);
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Método para ordenar por fila
    public static int[][] ordenarPorFila(int[][] matriz) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            resultado[i] = matriz[i].clone(); // Copia la fila
            Arrays.sort(resultado[i]); // Ordena la fila
        }
        return resultado;
    }

    // Método para ordenar por columna
    public static int[][] ordenarPorColumna(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        // Copiar la matriz original
        for (int i = 0; i < filas; i++) {
            resultado[i] = matriz[i].clone();
        }

        // Ordenar cada columna
        for (int j = 0; j < columnas; j++) {
            int[] columna = new int[filas];

            // Extraer la columna
            for (int i = 0; i < filas; i++) {
                columna[i] = resultado[i][j];
            }

            Arrays.sort(columna); // Ordenar la columna

            // Volver a insertar la columna ordenada
            for (int i = 0; i < filas; i++) {
                resultado[i][j] = columna[i];
            }
        }

        return resultado;
    }
}
