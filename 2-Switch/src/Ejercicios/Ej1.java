/*
La evaluación de un postulante a un puesto de trabajo resulta en una puntuación entre 0 y 10. 
Se desea mostrar una descripción de la evaluación alcanzada de acuerdo con los siguientes criterios:  
0-4 → descartado  
5 → en suspenso  
6 → aceptable  
7,8 → notable  
9, 10 → sobresaliente  
Escriba un programa que solicite la puntuación de un candidato y muestre la descripción que le corresponda.
 */

package Ejercicios;

import java.util.Scanner;  
  
public class Ej1 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        System.out.println("ingrese la puntuacion del candidato del 0 al 10 " );  
        byte puntuacion = leer.nextByte();  
          
         
        switch(puntuacion) {  
            case 0, 1, 2, 3, 4: System.out.println("descartado");   
            break;  
            case 5:System.out.println("en suspension");   
            break;  
            case 6:System.out.println("aceptable");   
            break;  
            case 7, 8:System.out.println("notable");   
            break;  
            case 9, 10:System.out.println("sobresaliente");   
            break;  
            
        }  
    }  
}