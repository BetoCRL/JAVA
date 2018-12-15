package ficha.pkg8;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        int qntd, teste;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a quantidade de numeros que pretende inserir: ");
        qntd = leia.nextInt();
        int vetor[] = new int[qntd];
        inserirel(vetor);
        osmaiores(vetor);
        
    }

    public static int[] inserirel(int[] vetor) {
        int i, n, j, type = 0, contador = 0;
        Scanner leia = new Scanner(System.in);
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Insira um numero: ");
            n = leia.nextInt();
            for (j = 0; j < i; j++) {
                if (n == vetor[j]) {
                    System.out.println("Numero Repetido");
                    type = 1;
                    break;
                }

            }
            while (type == 1) {
                System.out.println("Insira outro numero sem estar na lista: ");
                n = leia.nextInt();
                for (j = 0; j < i; j++) {
                    if (n == vetor[j]) {
                        System.out.println("Numero Repetido");
                        type = 1;
                        break;
                    }
                    else{
                        contador=contador+1;
                    }
                }
                System.out.println(contador+ " "+ i);
                if (contador==i){
                    type=0;
                }
                contador=0;
            }
            if (type == 0) {
                vetor[i] = n;
            }
        }
        return vetor;
    }
    public static void osmaiores(int []vetor){
        int i,maior,corrente;
        Scanner leia= new Scanner (System.in);
        System.out.println("Insira do vetor quantos numeros maiores quer: ");
        maior= leia.nextInt();
        for (i = 0; i < vetor.length-1; i++) {
            if (vetor[i] < vetor[i+1]){
                corrente=vetor[i];
                vetor[i]=vetor[i+1];
                vetor[i+1]=corrente;
            }
        }
        System.out.println("Os maiores elementos do vetor sao: ");
        for (i= 0; i<maior; i++){
            System.out.print(vetor[i]+ " ");
        }
    }

}
