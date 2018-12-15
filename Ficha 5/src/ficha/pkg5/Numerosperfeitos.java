package ficha.pkg5;

import java.util.Scanner;

public class Numerosperfeitos {

    public static void main(String[] args) {
        int n, i, conta, acumulador = 0, contador=1;
        String numerosper= "";
        while (contador<=2){
            Scanner leia = new Scanner(System.in);
            System.out.println("Insira um numero: ");
            n=leia.nextInt();
            for (i = 1; i < n; i++) {
                conta = (n % i);
                if (conta == 0) {
                    acumulador = acumulador + i;
                    
                    if ((acumulador)==n){
                        numerosper= numerosper + "" + n + "|";
                        contador=contador+1;
                    }
                }
            }
        acumulador=0;
        }
    System.out.println("Numeros Perfeitos: " + numerosper);
    }
}
