package numerolimite;

import java.util.Scanner;

public class NumeroLimite {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        
        System.out.println("Ingrese un limite: ");
        limite= entrada.nextInt();
        
        for(int i=1; i <= limite; i++){
            System.out.println(i);
        }
        
        
    }
    
}
