
package ficha.pkg6;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
     int  n, x=0, z=1, conta, contador=1, proximo;
     Scanner leia= new Scanner(System.in);
     System.out.println("Insira quantos termos quer : ");
     n=leia.nextInt();
     while(contador<=n){
         conta=x+z;
         System.out.println(conta);
         proximo=conta+z;
         System.out.println(proximo);
         z=proximo;
         x=conta;
         contador=contador+2;
     }        
    }
    
}
