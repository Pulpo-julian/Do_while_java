
import java.util.Scanner;




public class punto_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 0, edad = 0;
        
        do {
            System.out.println("ingrese una edad:");
            edad = sc.nextInt();
            contador = contador + edad;
            System.out.println("el promedio de edades es de: " + contador);
            if (contador > 25) {
                System.out.println("el promedio de edades supera los 25");
                System.out.println("el programa ha finalizado");
            }
        } while (contador < 25);
        
    }

    
}
