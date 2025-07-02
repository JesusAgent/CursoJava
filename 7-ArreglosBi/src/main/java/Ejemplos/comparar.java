package Ejemplos;

/**
Usamos Arrays.deepEquals() para comparar dos arreglos bidimensionales.
 */

import java.util.Arrays;  
  
public class comparar {  
    public static void main(String[] args) {  
  
        int[][] matriz1 = {{5, 4, 9}, {1, 3, 8}, {2, 9, 6}};  
        int[][] matriz2 = {{5, 4, 7}, {1, 3, 8}, {2, 9, 0}};  
  
        boolean iguales = Arrays.deepEquals(matriz1,matriz2);  
  
        System.out.println(iguales? "son iguales" : "no son iguales");  
    }  
}