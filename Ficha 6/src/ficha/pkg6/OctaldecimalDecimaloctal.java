
package ficha.pkg6;

import java.util.Scanner;
public class OctaldecimalDecimaloctal {

   
    public static void main(String[] args) {
       int numero,verf, transform;
       Scanner leia=new Scanner(System.in);
       System.out.println("Insira um numero em base octal: ");
       numero=leia.nextInt();
       verf=verificacao(numero);
     
       if (verf==0){
           System.out.println("Nao esta em base octal");
       }
       else{
           while (verf!=0){
               transform=transformacao(verf);
                 System.out.println(transform);
               System.out.printf("A conversao de octal para decimal do numero %d",transform);
               System.out.println("\nInsira um numero em base octal: ");
               numero=leia.nextInt();
               verf=verificacao(numero);
           }
       }
    }
    public static int verificacao(int n){
        int conta, contador=0, contador2=0, numero;
        numero=n;
        while(n>0){
            conta=n%10;
            if (conta>=0 && conta<=7){
                contador=contador+1;
            }
            contador2=contador2+1;
            n=n/10;
           
        } 
        if (contador2==contador){
            return numero; 
        }
        else{
            
        }return 0;
    } 
    public static int transformacao(int n){
        int conta, contador=0, numero=0;
        while (n>0){
            conta=n%10;
            numero=(int) (numero+conta*Math.pow(8, contador));
            contador=contador+1;
            n=n/10; 
        }
        return numero;
    }
}
