package ficha.pkg8;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        int linha, colunas;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o tamanho da sua matriz");
        System.out.println("Linhas: ");
        linha = leia.nextInt();
        System.out.println("Colunas: ");
        colunas = leia.nextInt();
        int[][] matriz = new int[linha][colunas];
        matriz(matriz);
        ordenar(matriz, linha, colunas);
    }

    public static int[][] matriz(int[][] matriz) {
        //Inserindo numeros a matriz
        int i, j;
        Scanner leia = new Scanner(System.in);
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.printf("Insira um elemento para a posicao |%d %d|: ", i, j);
                matriz[i][j] = leia.nextInt();
            }
        }
        return matriz;
    }

    public static void ordenar(int[][] matriz, int linhas, int colunas) {
        int i, j, a, k, x, type = 0, contador = 0, pars = 0, carne, peixe = 0;
        int[] y = new int[linhas * colunas];
        int[][] novo = new int[2][linhas * colunas];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                a = matriz[i][j];
                for (carne = 0; carne < y.length; carne++) {
                    if (a != y[carne]) {
                        type = 1;
                    } else {
                        type = 0;
                        break;
                    }
                }
                if (type == 1) {
                    y[peixe] = a;
                    peixe = peixe + 1;
                    for (k = i; k < matriz.length; k++) {
                        for (x = 0; x < matriz[0].length; x++) {
                            if (a == matriz[k][x]) {
                                contador = contador + 1;
                            }
                            novo[0][pars] = a;
                            novo[1][pars] = contador;
                        }
                    }
                    contador = 0;
                    pars = pars + 1;
                }
            }
        }

        darprint(novo, pars);
    }

    public static void darprint(int[][] thegoat, int pars) {
        int i, j, corrente;
        System.out.println("EL MATRIZ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < pars; j++) {
                if (thegoat[1][j] < thegoat[1][j + 1]) {
                    corrente = thegoat[1][j];
                    thegoat[1][j] = thegoat[1][j + 1];
                    thegoat[1][j + 1] = corrente;
                    corrente = thegoat[0][j];
                    thegoat[0][j] = thegoat[0][j + 1];
                    thegoat[0][j + 1] = corrente;
                }

            }

        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < pars; j++) {
               System.out.printf("%4d", thegoat[i][j]);
               
            }
            System.out.println();
        }
    }

}
