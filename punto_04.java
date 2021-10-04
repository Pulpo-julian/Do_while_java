
import java.util.Scanner;


public class punto_04 {
    public static void main(String[] args) {
        
            
        Scanner sc = new Scanner(System.in);

        int pregunta = 1, sexo = 0, fem = 0, mas = 0 ;
        int salarioIng = 0;
        int salarioMayor = 0, salarioMenor = 0;
        int promedioMayor = 0, promedioMenor = 0;
        int cantMayores = 0, cantMenores = 0;
        double proToMayores = 0, proToMenores = 0;

        do {
            System.out.println("desea ingresar un nuevo empleado? ");
            System.out.println("1 es SI");
            System.out.println("0 es NO");
            pregunta = sc.nextInt();
            if (pregunta == 1){
                
                System.out.println("ingrese el sexo del empleado");
                System.out.println("1 es Femenino");
                System.out.println("0 es Masculino");
                sexo = sc.nextInt();
                
                if (sexo == 1) {
                    fem ++;
                } else if (sexo == 0) {
                    mas ++;
                }
                
                System.out.println("ingrese el salario del empleado: ");
                salarioIng = sc.nextInt();
                
                //determino si el salario es el mayor o el menor de todos
                if (salarioIng > salarioMayor){
                    salarioMayor = salarioIng;
                    promedioMayor = promedioMayor + salarioIng;
                    cantMayores ++;
                    if (salarioMenor == 0) {
                        salarioMenor = salarioMayor;
                    }
                } else if (salarioIng < salarioMenor) {
                    salarioMenor = salarioIng;
                    promedioMenor = promedioMenor + salarioIng;
                    cantMenores ++;
                }
                
                
                
            } else {
                
                System.out.println("el programa finalizo");
                System.out.println("el salario mayor es: " + salarioMayor);
                System.out.println("el salario menor es: " + salarioMenor);
                
                proToMayores = promedioMayor / cantMayores;
                proToMenores = promedioMenor / cantMenores;
                
                System.out.println("el promedio de salarios mayores es de: " + proToMayores);
                System.out.println("el promedio de salarios menores es de: " + proToMenores);
                System.out.println("---------");
                System.out.println("la cantidad de empleadas Mujeres son: " + fem);
                System.out.println("la cantidad de empleados Hombres son: " + mas);
                
                pregunta = 0;
                
            }
            
        } while (pregunta == 1);
        
    }
    
    
}
