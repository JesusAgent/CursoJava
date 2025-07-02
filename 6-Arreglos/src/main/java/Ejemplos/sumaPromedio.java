/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author ztwen
 */
public class sumaPromedio {
    public static void main(String[] args) {
        
        int[] puntajes = {20, 15, 19, 17};
        int total = 0;
        float promedio;
        
        for (int i = 0; i < puntajes.length; i++) {
            total += puntajes[i];
        }
        
        promedio = (float) total / puntajes.length;
        System.out.printf("total: %d\npromedio: %f", total, promedio);
    }
}
