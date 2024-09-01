
package ejercicioscondicionales;

import java.util.Scanner;


public class EjerciciosCondicionales {
   
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        double repositor = 15890;
        double cajero = 25630.89;
        double supervisor = 35560.20;
        double sueldo;
        int opcion;
        
        System.out.println("--- MENU --- \n"
                + "1) repositor \n"
                + "2) cajero \n"
                + "3) supervisor \n");
        
        opcion = entrada.nextInt();
        
        if(opcion == 1){
            sueldo = repositor + (repositor*0.10);
            System.out.println("El sueldo del repositor es= "+ sueldo);
        }
        
        else if(opcion == 2){           
            System.out.println("El sueldo del empleado es : " + cajero);
        }
        
        else if(opcion == 3){
            sueldo = supervisor - ((11*supervisor) / 100 ) ;
            System.out.println("El sueldo del empleado es : " + sueldo);
        }
        
        else {
            System.out.println("La opcion no es valida");
        }
        
    }
    
}
