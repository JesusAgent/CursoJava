/*
Escribir un programa que solicite los nombres y edades de 
cinco personas y muestre un reporte ASCII con los datos 
ingresados, ordenados por edad, en orden ascendente.
 */
package estructurasRepArreglos;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ztwen
 */
public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[][] personas = new String[5][2];
        
        for(int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre de la persona " + (i + 1));
            personas[i][0] = leer.nextLine();
            
            System.out.println("ingrese la edad de " + personas[i][0]);
            personas[i][1] = leer.nextLine();
        }
        
        Arrays.sort(personas, (a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
        
        System.out.println("\n+----------------------+------+\n|                 Nombre | Edad |\n+----------------------+------+" );
        
        for(String[] persona : personas) {
            System.out.printf("| %-20s | %4s |\n", persona[0], persona[1]);
        }
        System.out.println("+----------------------+------+" );
    }
    
}
