//punto 1
import java.util.Scanner;



public class punto_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pregunta = 1, numeroIng = 0;
        
        
        do {
            
            System.out.println("desea ingresar un numero?");        
            System.out.println("1 es SI");
            System.out.println("0 es NO");
            pregunta = sc.nextInt();
            
            if (pregunta == 1){
                System.out.println("ingrese un numero entre 0 y 999");
                numeroIng = sc.nextInt();
                if (numeroIng >= 100){
                    System.out.println("el numero tiene 3 cifras \n");
                } else if (numeroIng >=10) {
                    System.out.println("el numero tiene 2 cifras \n");
                } else {
                    System.out.println("el numero tiene 1 cifra \n");
                }
            } else {
                System.out.println("el programa ha finalizado");
                pregunta = 0;
            }
            
            
        } while (pregunta == 1);
        
        
        
    }
}
