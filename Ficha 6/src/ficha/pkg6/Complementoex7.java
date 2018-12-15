
package ficha.pkg6;

import java.util.Scanner;

public class Complementoex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n, digitos, conta, numero=1;
       Scanner leia= new Scanner (System.in);
       System.out.println("Insira um numero: ");
       n=leia.nextInt();
       System.out.println("\nA persistencia é: "+ "\n" +n);
       digitos= contadigitos (n);
       while (digitos!=1){
           while (n>0){
               conta=n%10;
               numero= numero * conta;
               n=n/10;
           }
           n=numero;
           numero=1;
           System.out.println(n);
           digitos= contadigitos(n);
       }
    }
    public static int contadigitos(int n){
        int contador=0;
        while (n>0){
            n=n/10;
            contador=contador+1;
        }
        return contador;
    }
}
