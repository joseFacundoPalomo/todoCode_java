package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        double matriz[][]= new double[4][4];
        Scanner entrada = new Scanner(System.in);
        double promedio=0;
        int cont=0;
        
        for(int f=0;f<=3;f++){
            for(int c=0;c<=2;c++){
                System.out.println("Ingrese nota "+(c+1)+" de alumno "+(f+1)+":");                               
                matriz[f][c]= entrada.nextDouble();
                
                promedio= promedio+matriz[f][c];
                cont=cont+1;
                
                if(cont == 3){
                    matriz[f][3]=promedio;                    
                    System.out.println("PROMEDIO ALUMNO "+(f+1)+": "+(promedio/3));
                    System.out.println("--------------------------------------");
                    System.out.println("");
                    
                    promedio=0;
                    cont=0;
                }
            }
        }
        
    }
    
}
