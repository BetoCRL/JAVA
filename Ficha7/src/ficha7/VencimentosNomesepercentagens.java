package ficha7;

import java.util.Scanner;

public class VencimentosNomesepercentagens {

    public static void main(String[] args) {
        int i = 0, conta = 0, dado, x = 0, z = 0;
        double media, percentagem;
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[20];
        String a = "tt", maioresmedia;
        int[] salario = new int[20];
        System.out.println("Insira um salario para o verf: ");
        dado = leia.nextInt();
        System.out.println("Insira o seu nome: ");
        nomes[i] = leia.nextLine();
        nomes[i] = leia.nextLine();
        if (nomes[i].equalsIgnoreCase(a)) {
            System.out.println("sem dados");
            z = 1;
        }
        if (z != 1) {
            System.out.println("Insira o seu salario: ");
            salario[i] = leia.nextInt();
        }

        if (z != 1) {
            while (!nomes[i].equalsIgnoreCase(a)) {
                conta = conta + salario[i];
                i = i + 1;
                System.out.println("Insira um nome: ");
                nomes[i] = leia.nextLine();
                nomes[i] = leia.nextLine();

                if (nomes[i].equalsIgnoreCase(a)) {
                    break;
                }
                System.out.println("Insira o seu salario: ");

                salario[i] = leia.nextInt();
            }
        }
        if (z != 1) {
            media = media(i, conta);
            maioresmedia = maioresmedia(salario, media, nomes, i);
            percentagem = percentagem(salario, dado, i);
            System.out.println("Funcinarios com vencimentos inferiores a media:\n" + maioresmedia);
            System.out.format("Percentagem de funcionarios com vencimentos inferiores ao valor introduzido: %.2f%% ", percentagem);
        }

    }

    public static double media(int i, int conta) {
        double media;
        media = (conta / i);
        return media;
    }

    public static String maioresmedia(int salario[], double media, String nomes[], int i) {
        int x;
        String a = "";
        for (x = 0; x < i; x++) {
            if (media > salario[x]) {
                a = a + nomes[x] + "\n";
            }
        }
        return a;
    }

    public static double percentagem(int salario[], int dado, int i) {
        int contador = 0, x, conta;
        for (x = 0; x < i; x++) {
            if (dado > salario[x]) {
                contador = contador + 1;
            }
        }
        conta = ((i - contador) * 100) / i;
        return conta;
    }
}
