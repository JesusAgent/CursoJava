/*
Utiliza arreglos paralelos, siendo uno de ellos una matriz que almacene las
notas de PC1, PC2, PC3 y EF.
• Los arreglos deben inicializarse con
los datos mostrados.
• Todos los promedios deben ser
calculados por el programa.
• Deberá mostrarse el reporte
ordenado por nombre.

 */
package Ejercicios;

import java.util.Arrays;


public class Ejercicio1 {
    public static void main(String[] args) {
        
        String[] nombres = {
            "ANA MARIELA TORRES MONIEZ",
            "CARLOS ALBERTO ROJAS CHAN",
            "GABRIELA LUCIA ALVITES CH",
            "JUAN CARLOS GARCIA RODRIG",
            "ROSA INOÑAN FARRO"};
        
        int[] edades = {25,24,25,19,22};
        int[] grados = {5,6,5,5,4};
        
        double[][] notas = {
            {20, 17, 18, 16}, // Ana
            {15, 12, 13, 15}, // Carlos
            {20, 20, 14, 15}, // Gabriela
            {20, 15, 17, 17}, // Juan
            {20, 18, 12, 13}  // Rosa
        };
        
        //calcular los promedios
        
        double[] promedios = new double[nombres.length];
        double sumaTotal = 0;
        for(int i = 0; i < nombres.length; i++) {
            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3])/4.0;
            sumaTotal += promedios[i];
  
        }

        double promedioTotal = sumaTotal / nombres.length;

        // Ordenar por nombre usando un índice auxiliar
        Integer[] indices = new Integer[nombres.length];
        
        for(int i = 0; i < nombres.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i, j) -> nombres[i].compareTo(nombres[j]));
        
        System.out.println("###########################################");
        System.out.println("########### REPORTE DE NOTAS #############");
        System.out.println("###########################################\n");

        System.out.printf("%-30s %-5s %-5s %-5s %-5s %-5s %-5s%n", 
                          "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM");

        System.out.println("--------------------------------------------------------------");
        
        for(int i : indices){
            System.out.printf("%-30s %-5d %-5d %-5.0f %-5.0f %-5.0f %-5.0f %-5.2f%n", nombres[i], edades[i], grados[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], promedios[i]);    
        }
            
        System.out.println("--------------------------------------------------------------");
        System.out.printf("PROMEDIO TOTAL: %.2f%n", promedioTotal);
        System.out.println("###########################################");
 
            
    }
    
}







