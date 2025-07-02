import java.util.Scanner;  
  
public class Ejemplo3 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        System.out.println("ingrese un score de 1 a 10 " );  
        byte score=leer.nextByte();  
          
        switch(score) {  
            case 1, 2, 3, 4, 5, 6: System.out.println("detractor"); break;  
            case 7, 8: System.out.println("pasivo"); break;  
            case 9, 10: System.out.println("promotor"); break;  
            case 11: System.out.println("error...");  
              
        }  
    }  
}
