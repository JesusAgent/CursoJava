package Ejemplos;

/*
Usamos dos bucles anidados. 
El bucle externo recorrerá las filas, y el interno, las columnas.
*/

public class RecorridoFilas {  
    public static void main(String[] args) {  
  
        int[][] matriz = { { 18, 6, 29 },{ 64, 11, 7 },{ 30, 81, 37 }};  
        for (int f = 0; f < matriz.length; f++) {  
            for (int c = 0; c < matriz[0].length; c++) {  
                System.out.printf("%2d ", matriz[f][c]);  
            }  
            System.out.println();  
        }  
    }  
}