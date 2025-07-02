/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosClase;

import java.util.Scanner;  
  
public class Ejm3 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        boolean esdiaSemana = true;  
        int dia = 0;  
          
        while(esdiaSemana) {  
            System.out.println("ingrese un dia de la semana [1-7] --> ");  
            dia = leer.nextInt();  
              
            esdiaSemana = (dia < 1 || dia > 7);  
        }  
          
        System.out.println("el die ingresado es: " + dia);  
    }  
}