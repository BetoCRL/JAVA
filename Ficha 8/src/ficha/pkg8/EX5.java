package ficha.pkg8;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        int i, j,E;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira quantas linhas deseja inserir: ");
        i = leia.nextInt();
        System.out.println("Insira quantas colunas deseja inserir: ");
        j = leia.nextInt();
        int[][] matriz = new int[i][j];
        adicionarel(matriz);
        System.out.println("Insira o elemento E: ");
        E=leia.nextInt();
    }

    public static int[][] adicionarel(int[][] matriz) {
        int i, j;
        Scanner leia = new Scanner(System.in);
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.printf("Insira um elemento na posicao |%d %d|: ",i,j);
                matriz[i][j] = leia.nextInt();
            }
        }
        return matriz;
    }
    public static void cabecilha(int [][]matriz,int elemento){
        
    }
}
