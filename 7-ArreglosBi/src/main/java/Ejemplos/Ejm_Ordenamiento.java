package Ejemplos;

import java.lang.reflect.Array;  
import java.util.Arrays;  

public class Ejm_Ordenamiento {  
    public static void main(String[] args) {  
  
        int[][] matriz = {{5,4,7},{1,3,8},{2,9,6}};  
        int[] vector = new int[9];  
        int indice = 0;  
  
        // Extraer los elementos de la matriz y meterlos en el vector  
        for (int i = 0; i < matriz.length; i++) {  
            for (int j = 0; j < matriz.length; j++) {  
                vector[indice++] = matriz[i][j];  
            }  
        }  
  
        // Ordenar el vector  
        Arrays.sort(vector);  
  
        // Volver a asignar los valores del vector a la matriz  
        indice = 0;  
        for (int i = 0; i < matriz.length; i++) {  
            for (int j = 0; j < matriz.length; j++) {  
                matriz[i][j] = vector[indice++];  
                System.out.print(matriz[i][j] + " ");  
            }  
            System.out.println();  
        }  
  
    }  
}
