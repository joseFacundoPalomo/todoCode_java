package vector;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in); 
        int arreglo[]= new int[15];
        int contador=0;
        int i;
        
        
        for(i=0;i<=14;i++){        
            System.out.println("Ingrese el numero "+ (i+1)+":");
            arreglo[i]= teclado.nextInt();
            
            if(arreglo[i] == 3){
                contador = contador+1; 
            }
        }
               
        System.out.println("Cantidad de nro 3: "+ contador);
    }
    
}
