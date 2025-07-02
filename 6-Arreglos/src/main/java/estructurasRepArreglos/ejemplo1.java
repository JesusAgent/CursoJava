/*
 Programa que solicita los nombres y edades 5 personas y muestra los datos formateados y un 
 mensaje que indica si son mayores o menores de edad
 */
package estructurasRepArreglos;

import java.util.Scanner;

/**
 *
 * @author ztwen
 */
public class ejemplo1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] nombres = new String[5];
        int[] edades = new int[5];
        
        for(int i = 0; i < nombres.length; i++) {
            
            System.out.printf("%d Persona\n", i + 1);
            
            System.out.printf("ingrese nombre ");
            
            nombres[i] = leer.nextLine();
            
            System.out.printf("ingrese edad ");
            
            edades[i] = leer.nextInt();
            
            leer.nextLine();
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-16s %2d [%s]\n", nombres[i], edades[i], edades[i] >= 18? "mayor de edad" : "menor de edad");
        }
    }
}
