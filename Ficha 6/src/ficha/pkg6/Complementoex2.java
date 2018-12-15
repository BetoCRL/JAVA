package ficha.pkg6;

import java.util.Scanner;
public class Complementoex2 {


    public static void main(String[] args) {
       int  n, contador=2, verfi;
       Scanner leia= new Scanner(System.in);
       System.out.println("Insira um numero: ");
       n=leia.nextInt();
       verfi=capicua(n);
       while(n != verfi && contador<=99  ){
           contador=contador+1;
           if (contador==99){
               System.out.println("Nao teve nenhum numero capicua");
               break;
           }
           System.out.println("Insira um numero: ");
           n=leia.nextInt();
           verfi=capicua(n);
       }
       if (n==verfi){
           System.out.println("É uma capicua");
       }
       
    }
    public static int capicua(int n){
        int conta, numero=0, digitos=0, numer;
        numer=n;
        while (n>0){
            n=n/10;
            digitos=digitos+1;
            
        }
        
        
        while (numer>0){
            conta=numer%10;
            numero=(int) (numero+ conta*Math.pow(10, digitos-1));
            digitos=digitos-1;
            numer=numer/10;
        }
        return numero;
    }
    
}
