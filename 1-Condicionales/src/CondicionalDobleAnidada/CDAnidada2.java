/*
Escribir un programa en Java que solicite el sexo y sector de un funcionario y calcule el 
monto que recibirá luego de aplicado el aumento
 */
package CondicionalDobleAnidada;

import java.util.Scanner;  
  
public class CDAnidada2 {  
    public static void main(String[] args) {  
          
        Scanner leer =  new Scanner(System.in);  
          
        double aumento;  
          
        System.out.println("ingrese el genero del empleado, [M] masculino, [F] femenino ");  
          
        char sexo = leer.next().charAt(0);  
          
        System.out.println("ingrese el sector donde labora ");  
        String sector = leer.next();  
          
        if(sexo=='M' ||  sexo=='m'){  
            if(sector.equalsIgnoreCase("salud")) {  
                aumento= 0.20*15000;  
            } else if(sector.equalsIgnoreCase("educacion")) {  
                    aumento= 0.11*12000;  
            }  
            else if(sector.equalsIgnoreCase("transporte")) {  
                    aumento= 0.15*18000;  
            }  
            else  
                aumento = 0;  
              
                   
            }   else if(sexo=='F' ||  sexo=='f'){  
                if(sector.equalsIgnoreCase("salud")) {  
                    aumento= 0.20*15000;  
                } else if(sector.equalsIgnoreCase("educacion")) {  
                    aumento= 0.11*12000;  
                }  
                else if(sector.equalsIgnoreCase("transporte")) {  
                    aumento= 0.15*18000;  
                }  
                else  
                    aumento = 0;  
        }           
    }   
}
