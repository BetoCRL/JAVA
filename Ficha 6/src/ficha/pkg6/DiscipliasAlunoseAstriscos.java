package ficha.pkg6;

import java.util.Scanner;

public class DiscipliasAlunoseAstriscos {

    public static void main(String[] args) {
        int disciplinas, alunos, contador = 1, aprovados, reprovados;
        String cadeira, post, negas, a;
        String resto = "";
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira quantos alunos sao: ");
        alunos = leia.nextInt();
        System.out.println("Insira quantas disciplinas sao: ");
        disciplinas = leia.nextInt();
        while (contador <= disciplinas) {
            System.out.println("Insira o nome da disciplina: ");
            cadeira = leia.nextLine();
            cadeira= leia.nextLine();
            System.out.println("Insira  o numero de alunos aprovados: ");
            aprovados = leia.nextInt();
            reprovados = alunos - aprovados;
            post = posit(aprovados);
            negas = negas(reprovados);
            resto = resto + "Disciplina: " + cadeira + "\n" + "Positivas: " + post + "\n" + "Negativas: " + negas + "\n";
            contador = contador + 1;
        }
        System.out.println(resto);

    }

    public static String posit(int aprovados) {
        int contador = 0;
        String posit = "";
        while (contador < aprovados) {
            posit = posit + "*";
            contador = contador + 1;
        }
        return posit;

    }

    public static String negas(int reprovados) {
        int contador = 0;
        String negas = "";
        while (contador < reprovados) {
            negas = negas + "*";
            contador = contador + 1;
        }
        return negas;

    }

}
