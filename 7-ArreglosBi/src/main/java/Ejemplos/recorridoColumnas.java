package Ejemplos;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Usamos dos bucles anidados. 
El bucle externo recorrerá las columnas, y el interno, las filas.
 */

public class recorridoColumnas {  
    public static void main(String[] args) {  
  
        int[][] matriz = {{18, 6, 29},{64, 11, 7},{30, 81, 37}};  
  
        for (int c = 0; c < matriz[0].length; c++) {  
            for (int f = 0; f < matriz.length; f++) {  
                System.out.printf("%2d ", matriz[f][c]);  
            }  
            System.out.println();  
        }  
    }  
}