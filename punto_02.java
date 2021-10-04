//punto 2
import java.util.Scanner;




public class punto_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pregunta = 1, nota = 0, notasMay = 0, notasMen = 0;
        
        
        do {
            
            System.out.println("desea ingresar una nota?");        
            System.out.println("1 es SI");
            System.out.println("0 es NO");
            pregunta = sc.nextInt();
            
            if (pregunta == 1){
                System.out.println("ingrese la nota");
                nota = sc.nextInt();
                if (nota >= 7){
                    System.out.println("la nota es mayor igual a 7 \n");
                    notasMay ++;
                } else {
                    System.out.println("la nota es menor que 7 \n");
                    notasMen ++;
                }
            } else {
                System.out.println("el programa ha finalizado");
                System.out.println("ingresaste " + notasMay + " notas mayores o iguales a 7");
                System.out.println("ingresaste " + notasMen + " notas menores a 7");
                pregunta = 0;
            }
            
            
        } while (pregunta == 1);
    }
}
