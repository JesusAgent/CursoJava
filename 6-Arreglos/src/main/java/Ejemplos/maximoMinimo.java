/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author ztwen
 */
public class maximoMinimo {
    public static void main(String[] args) {
        
        int[] puntajes = {20, 15, 19, 17};
        int min, max;
        max = min = puntajes[0];
        
        for (int puntaje : puntajes) {
            if (max < puntaje) max = puntaje;
            if (min > puntaje) min = puntaje;
        }
        
        System.out.printf("maximo %d\nminimo %d", max, min);
        
    }
}
