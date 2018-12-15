package ficha.pkg6;

import java.util.Scanner;

public class doisdigtretdigemcomumeretorn {

    public static void main(String[] args) {
        int n, contador = 0, a, b, i = 0, j, k, conta = 0, x, conta2 = 0, contavezes = 0, p,l;
        String w = null;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira quantos pares vai inserir: ");
        n = leia.nextInt();
        System.out.println("Insira um numero: ");
        a = leia.nextInt();
        System.out.println("Insira um numero: ");
        b = leia.nextInt();
        p=a;
        l=b;
        j = digitos(a);
        k = digitos(b);
        while (contador <= n) {
            while (a > 0 && b > 0) {
                for (i = 1; i <= j; i++) {
                    if (a > 0) {
                        conta = a % 10;
                    }

                    a = a / 10;
                    for (x = 1; x <= k; x++) {
                        if (b > 0) {
                            conta2 = b % 10;
                            if (conta == conta2) {
                                contavezes = contavezes + 1;
                            }
                        }
                        b = b / 10;
                    }
                }
                System.out.println(contavezes);

            }
            w=oparmaior(p,l,contavezes);
            contador = contador + 1;
            if (contador== n){
               break;
            }
            System.out.println("Insira um numero: ");
            a = leia.nextInt();
            p=a;
            System.out.println("Insira um numero: ");
            b = leia.nextInt();
            l=b;
            contavezes=0;
      
        
        }
        System.out.println("O maior par é : " + w);
    }
    

    public static int digitos(int digitos) {
        int contador = 0;
        while (digitos > 0) {
            digitos = digitos / 10;
            contador = contador + 1;
         
        }
        return contador;
    }
   public static String oparmaior(int a, int b, int contavezes){
       int maior = 0, n ;
       n= contavezes;
       String par = "";
       if (n > maior){
           maior=n;
           par= a + "/" + b;
       }
       return par;
   }
}
