package ficha.pkg6;

import java.util.Scanner;

public class Complementoex9 {

    public static void main(String[] args) {
        int n, verif, contador = 1;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        n = leia.nextInt();
        verif = verifperfeito(n);
        if (verif == 1) {
            System.out.println("Posicao do numero perfeito: 1");
        }

        while (verif != 1) {
            System.out.println("Insira um numero: ");
            n = leia.nextInt();
            verif = verifperfeito(n);
            contador = contador + 1;
        }
        if (contador > 1) {
            System.out.println("Posicao do numero perfeito: " + contador);
        }
    }

    public static int verifperfeito(int n) {
        int i, conta, x = 0, a;
        for (i = 1; i < n; i++) {
            conta = (n % i);
            if (conta == 0) {
                x = x + i;
            }
        }
        if (x == n) {
            return 1;
        } else {
            return 0;
        }
    }

}
