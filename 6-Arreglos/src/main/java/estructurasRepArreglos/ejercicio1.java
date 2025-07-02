/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepArreglos;

import java.util.HashSet;

/**
 *
 * @author ztwen
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        HashSet<Integer> conjuntoA = new HashSet<>();
        HashSet<Integer> interseccion = new HashSet<>();
        
        for(int num : A) {
            conjuntoA.add(num);
        }
        
        for(int num : B) {
            if(conjuntoA.contains(num)) {
                interseccion.add(num);
            }
        }
        
        System.out.println("interseccion de A y B " + interseccion);
        
        
    }
}
