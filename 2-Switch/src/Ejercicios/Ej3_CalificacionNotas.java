/*
Calificacion de notas
*/

package Ejercicios;

public class Ej3_CalificacionNotas {  
    public static void main(String[] args) {  
          
        byte nota = 16;  
        boolean rangoNota= (nota<0 || nota>20);  
          
        if (rangoNota) {  
            System.out.println("nota fuera de rango");  
        }  
        else {  
            switch (nota) {  
                case 19, 20: System.out.println("excelente");  
                break;  
                case 18, 17, 16: System.out.println("bueno");  
                break;  
                case 13, 14, 15: System.out.println("regular");  
                break;  
                default: System.out.println("deficiente");  
                break;  
                  
            }  
        }  
          
                  
              
    }  
}