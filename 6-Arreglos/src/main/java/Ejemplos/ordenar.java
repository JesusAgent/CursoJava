package Ejemplos;

import java.util.Arrays;

/**
Opción 1: implementar cualquier algoritmo de ordenamiento (bubble sort, merge sort, shell sort, etc.)
Opción 2: utilizar el método Arrays.sort() de Java.
 */

public class ordenar {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        int[] datos = {30,10,50,20,60,40,80,70};

        for (int da: datos) {
            System.out.println("---> " + da);
        }
        System.out.println("\n");

        Arrays.sort(datos); //ordena el arreglo

        for (int da: datos) { //para alamacenar los datos ordenados
            sb.append(da).append(" ");
        }

        for (int da: datos) {
            System.out.println("--> " + da);
        }
    }
}