
package ficha7;

import java.util.Scanner;
public class InversaoeRotacaoADireita {
  

    public static void main(String[] args) {
        int qntnum,i,inverter;
        Scanner leia= new Scanner(System.in);
        System.out.println("Insira a quantidade de numeros a inserir: ");
        qntnum=leia.nextInt();
        while (qntnum<=0){
            System.out.println("Insira a quantidade de numeros a inserir: ");
            qntnum=leia.nextInt();
        }
        int []v= new int[qntnum];
        for (i=0; i<qntnum; i++){
            System.out.printf("Insira o %d numero: ", i);
            v[i]=leia.nextInt();
        }
        inversao(v,qntnum);
        rotacaodireita(v,qntnum);
    }
   
    public static void inversao(int v[],int qntnum){
        int i;
        for (i=qntnum-1; i>=0; i--){
            System.out.print(v[i] + " ");
        }
        System.out.print("\n");
    }
    public static void rotacaodireita(int v[], int qntnum){
        int i, avanco, x, contador=0;
        int a[]= new int[qntnum];
        int k[]= new int[qntnum];
        for (i=qntnum-1; i>=0; i--){
            
             k[contador]=v[i];
            
            contador=contador+1;
        }
        
        for (i=0;i<qntnum;i++){
            avanco=i+1;
            x= k[i];
            if (avanco>qntnum-1){
                avanco=0;
                x=k[qntnum-1];
            }
            a[avanco]=x;
            
        }
        for (i=0;i<qntnum;i++){
           System.out.print(a[i]+ " ");
            
        }
        System.out.println("\n");
    }

}
