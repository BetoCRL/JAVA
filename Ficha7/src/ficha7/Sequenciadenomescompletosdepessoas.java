package ficha7;

import java.util.Scanner;

public class Sequenciadenomescompletosdepessoas {

    public static void main(String[] args) {
        int h, r;
        r = lerNomes();
    }

    public static int lerNomes() {
        int contador = 0, r;
        String h, l;
        String[] v = new String[100];
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o seu nome completo: ");
        v[contador] = leia.nextLine();
        l = v[contador];
        h = apelido(l);
        System.out.println("Apelido: " + h);

        while (!v[contador].equalsIgnoreCase("FIM")) {
            contador = contador + 1;
            System.out.println("Insira o seu nome completo: ");
            v[contador] = leia.nextLine();
            l = v[contador];
            h = apelido(l);
            System.out.println("Apelido: " + h);
        }
        for (r = 0; r < contador; r++) {
            System.out.print(v[r] + ", ");
        }
        return contador;
    }

    public static String apelido(String v) {
        String[] trx = v.split(" ");
        return trx[trx.length - 1];
    }

    public static void mostrarListagem(String[] v, int contador) {
        int i;
        String listagem=" ";
        for (i = 0; i < contador; i++) {
            listagem=listagem + (i + " Elemento:  " + v[i]);
        }
        System.out.println(listagem);
 
    }
}
