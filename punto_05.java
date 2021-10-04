// punto 5
import java.util.Scanner;


public class punto_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pregunta = 1;
        
        int numeroIni;
        int cantMenores = 0, cantMayores = 0, rango = 0;
        

        do {
            System.out.println("desea ingresar un numero?");
            System.out.println("1 es SI");
            System.out.println("0 es NO");
            pregunta = sc.nextInt();
            
            if (pregunta == 1) {
                System.out.println("ingrese un numero natural cualquiera:");
                numeroIni = sc.nextInt();
                if (numeroIni > 50) {
                    cantMayores ++;
                } else if ((numeroIni >= 24) && (numeroIni <= 45)){
                    rango ++;
                } else if (numeroIni < 15) {
                    cantMenores ++;
                }
            } else {
                System.out.println("la cantidad de numeros menores de 15 son: " + cantMenores);
                System.out.println("la cantidad de numeros entre 25 y 45 son: " + rango);
                System.out.println("la cantidad de numeros mayores de 50 son: " + cantMayores);
                pregunta = 0;
            }

        } while (pregunta == 1);
        
    }
    
}
