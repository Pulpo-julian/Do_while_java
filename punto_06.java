// punto 6
import java.util.Scanner;


public class punto_06 {
    public static void main(String[] args) {
        
        int dolares = 10;
        int edad = 12;
        
        
        do {
            
            dolares = dolares + (dolares * 2);
            edad ++;
            if (dolares >= 1000) {
                System.out.println("la edad de la niña sera de: " + edad);
                System.out.println("la cantidad de dinero que tendra es: " + dolares);
            }
            
        } while (dolares < 1000);
        
        
        
        
        
    }
            
}
