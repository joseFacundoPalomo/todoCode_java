package ejercicioslogicos;

import java.util.Scanner;


public class EjerciciosLogicos {
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int aux;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese numero 1: ");
        num1 = entrada.nextInt();
        
        System.out.println("");
        
        System.out.println("Ingrese numero 2: ");
        num2 = entrada.nextInt();
        
        aux= num2;
        num2= num1;
        num1= aux;
        
        System.out.println("El valor de num1 es: " + num1);
        System.out.println("El valor de num2 es: " + num2);
    }
    
}
