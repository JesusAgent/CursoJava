import java.util.Scanner;  
  
public class Ejemplo2 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        System.out.println("ingrese un pain de america: ");  
        String pais = leer.next();  
          
        /* toLowerCase convierte el argumento de carácter en minúsculas mediante la información   
        de asignación de mayúsculas y minúsculas del archivo UnicodeData */
        
        switch (pais.toLowerCase()) {  
            case "argentina":System.out.println("Maradonna");  
            break;  
            case "bolivia": System.out.println("Echeverry");  
            break;  
            case "brasil": System.out.println("Neymar");  
            break;  
            case "peru": System.out.println("Cueva");  
            break;  
            default: System.out.println("error");  
            break;  
        }  
                  
    }  
}