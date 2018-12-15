package ficha.pkg8;

import java.util.Formatter;
import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
       int [][]matriz={{1,4,2,1},{9,7,2,2},{1,7,3,5},{2,5,0,3},{4,7,2,1}};
       int mostra;
       Formatter out=new Formatter(System.out);
       Scanner leia=new Scanner(System.in);
       mostrarmatriz(matriz);
       System.out.println();
       media(matriz);
       System.out.println();
       transposta(matriz);
    }
    public static void mostrarmatriz(int [][] matriz){
        int i, j;
        for (i=0; i<matriz.length; i++){
            for (j=0; j<matriz[0].length; j++){
                   System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void media(int [][] matriz){
        int i, j, n=0, contador=0; 
        double media, acumuladora = 0, mediaglobal;
        for (i=0; i<matriz.length ; i++){
            for (j=0; j<matriz[0].length; j++){
                n=n+ matriz[i][j];
                contador=contador+1;
                }
            media=n/(matriz[0].length);
            System.out.printf("A media da %d  fila é igual: %f \n",i,media);
            acumuladora=acumuladora+media;
            n=0;
        }
        mediaglobal=(acumuladora/contador);
        System.out.println("A media desta matriz é igual a: " + mediaglobal);
        }
    public static void transposta(int [][]matriz){
        int i,j;
        for (j=0; j<matriz[0].length; j++){
            for (i=0; i<matriz.length; i++){
               System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
    }


