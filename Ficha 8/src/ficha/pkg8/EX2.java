package ficha.pkg8;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        int dim, linhas, colunas,diagonal1,diagonal2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a dimensao da matriz");
        dim = leia.nextInt();
        int[][] matriz = new int[dim][dim];
        iserirelet(matriz);
        linhas = Linhas(matriz);
        colunas = Colunas(matriz);
        diagonal1=Diagonal(matriz);
        diagonal2=DiagonalSec(matriz);
        System.out.println(linhas + " "+ colunas + " "+ diagonal1+ " "+ diagonal2);
        if (linhas==colunas && colunas==diagonal1 && diagonal1==diagonal2){
            System.out.println("É um quadrado perfeito");
        } 
        else{
            System.out.println("Não é um quadrado perfeito");
        }
    }

    public static int[][] iserirelet(int[][] matriz) {
        int i, j, n;
        Scanner leia = new Scanner(System.in);
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.printf("Insira um elemento para a posicao |%d %d|: ", i, j);
                matriz[i][j] = leia.nextInt();
            }
        }
        return matriz;
    }

    //LINHAS
    public static int Linhas(int[][] matriz) {
        int i, j, conta = 0, cont2 = 1, anterior = 0;
        for (i = 0; i < matriz.length; i++) {
            conta = 0;
            for (j = 0; j < matriz[0].length; j++) {
                conta = conta + matriz[i][j];
            }
            if (conta == anterior) {
                cont2 = cont2 + 1;
            } 
            anterior = conta;

        }
        return conta;
    }

    // COLUNAS
    public static int Colunas(int[][] matriz) {
        int i, j, conta = 0, cont2 = 1, anterior = 0;
        for (j = 0; j < matriz.length; j++) {
            conta = 0;
            for (i = 0; i < matriz[0].length; i++) {
                conta = conta + matriz[i][j];
            }
            if (conta == anterior) {
                cont2 = cont2 + 1;
            }
            anterior = conta;

        }
        return conta;
    }

    //DIAGONALP
    public static int Diagonal(int[][] matriz) {
        int i, j, conta = 0;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    conta = conta + matriz[i][j];
                }
            }
        
        }
        return conta;
    }
    //Diagonal Sec
    public static int DiagonalSec(int[][] matriz){
        int i,j,rato=0,conta=0;
        for (i=matriz.length-1; i>=0; i--){
            for (j=0; j<matriz[0].length;j++){
                if (rato==j){
                    conta=conta+matriz[i][j];
                }
            }
            rato=rato+1;
        }
        return conta;
    }
}
