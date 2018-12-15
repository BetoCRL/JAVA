package gameland;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class GameLand {

    //Configuracao da aplicação
    private final static int MAX_PARTICIPANTES = 30;
    private final static int N_CAMPOS_INFO = 4;
    private final static int N_JOGOS = 6;
    private final static int MAX_LINHAS_PAGINA = 3;
    //
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String[] jogos = new String[N_JOGOS];
        String[][] participantes = new String[MAX_PARTICIPANTES][N_CAMPOS_INFO];
        int nParticipantes = 0;
        String matriz[][] = new String[N_JOGOS][3];
        double[][] prémios = new double[MAX_PARTICIPANTES][N_JOGOS];
        int[] imp = new int[1];
        String []ficheiropnt=new String[1];
        int op, cl = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    try {
                        System.out.println("Qual é a data do evento (AAAAMMDD)?");
                        String nomeFich = in.nextLine();
                        carregarJogosDoEvento(nomeFich + ".txt", jogos);
                        System.out.println("Jogos Carregados com sucesso");
                    } catch (Exception e) {
                        System.out.println("Erro no carregamento dos jogos.Verifique Ficheiro");
                        e.printStackTrace();
                    }
                    cl = 1;
                    break;
                case 2:
                    if (cl == 1) {
                        visualizarInfoJogos(jogos);
                    } else {
                        System.out.println("Carregue o evento|Selecione a 1º opcção");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Insira o grupo que deseja carregar: ");
                        String file = in.nextLine();
                        imp = matriz(participantes, file);
                    }catch(FileNotFoundException a){
                        System.out.println("Erro Grupo invalido");
                    }
                    break;
                case 4:
                    listagempaginada(participantes, imp);
                    break;
                case 5:
                    System.out.println("Insira o email do participante: ");
                    String mail = in.nextLine();
                    actualizarInfoParticipantes(mail, participantes, imp);
                    break;
                case 6:
                    if (cl == 1) {
                        System.out.println("Insira os resultados de um jogo do evento: ");
                        String ficheiro = in.nextLine();
                        transformacao(jogos, matriz);
                        String pontos = numerodepontos(matriz, ficheiro);
                        boolean ver = verficacaopontos(pontos, ficheiro);
                        if (ver == true) {
                            listagempontos(ficheiro,ficheiropnt);
                        } else {
                            System.out.println("O ficheiro contem pontuacao acima ou igual a pontuacao maxima");
                        }

                    } else {
                        System.out.println("Carregue o evento|Selecione a 1º opcção");
                    }
                    break;
                case 7:
                    backup(ficheiropnt);
                default:
                    System.out.println("Insira uma OPÇÃO VALIDA");
                    break;
            }
        } while (op != 10);

    }

    //nelementos//
    public static int nelems(int elementos) {
        int a = elementos;
        return a;
    }

    //VISUALIZAR OS JOGOS DO EVENTO//
    private static void visualizarInfoJogos(String[] jogos) {
        System.out.println("Jogos do evento: ");
        System.out.printf("%15s%15s%15s%n", "ID JOGO", "TIPO DE JOGO", "MAX. DE PONTOS");
        for (int i = 0; i < jogos.length; i++) {
            String[] temp = jogos[i].split("-");
            System.out.printf("%15s%15s%15s%n", temp[0], temp[1], temp[2]);
        }
    }

    //MENU//
    private static int menu() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha uma Opcao: "
                + "\n" + "|1º-Carregar o Evento|"
                + "\n" + "|2º-Visualizar Jogos do Evento|"
                + "\n" + "|3º-Carregar Grupos/Grupo|"
                + "\n" + "|4º-Listagem Dos Grupos|"
                + "\n" + "|5º-Actualizar Participantes|"
                + "\n" + "|6º-Visualizacao dos pontos de um jogo|"
                + "\n" + "|7º-Fazer backup a informacao existem em memoria Part|Pnts");
        int op = leia.nextInt();
        return op;
    }

    //CARREGAR JOGOS//
    private static boolean carregarJogosDoEvento(String nomeFichJogos, String[] jogos) throws FileNotFoundException {
        Scanner fInput = new Scanner(new File(nomeFichJogos));
        int i = 0;
        while (fInput.hasNextLine() && i < N_JOGOS) {
            String linha = fInput.nextLine();
            if ((linha.trim().length() > 0)) {
                jogos[i] = linha;
                i++;
            }
        }
        fInput.close();
        if (i == N_JOGOS) {
            return true;

        } else {
            return false;
        }
    }
    //Inserir dados na matriz//

    public static int[] matriz(String[][] matriz, String ficheiro) throws FileNotFoundException {
        Scanner leiaficheiro = new Scanner(new File(ficheiro + ".txt"));
        int i, j, numerocomecar = 0, contador = 0;
        for (i = numerocomecar; i < matriz.length; i++) {
            for (j = 0; j < N_CAMPOS_INFO; j++) {
                if (matriz[i][j] == null) {
                    contador = contador + 1;
                    if (contador == 1) {
                        numerocomecar = i;
                        break;
                    }
                }

            }
        }
        while (leiaficheiro.hasNext()) {
            String[] vec = leiaficheiro.nextLine().trim().split(";");
            for (j = 0; j < N_CAMPOS_INFO; j++) {
                matriz[numerocomecar][j] = vec[j];
            }
            numerocomecar++;
        }
        int[] nElems = new int[1];
        nElems[0] = numerocomecar;
        leiaficheiro.close();
        return nElems;
    }

// Listar os Grupos//
    private static void listagempaginada(String[][] matriz, int[] nElems) {
        int contPaginas = 0;
        for (int i = 0; i < nElems[0]; i++) {
            if (i % MAX_LINHAS_PAGINA == 0) {
                if (contPaginas > 0) {
                    pausa();
                }
                contPaginas++;
                System.out.println("\nPAGINA:" + contPaginas);
                cabecalho();
            }
            for (int j = 0; j < N_CAMPOS_INFO; j++) {
                if (j == 1) {
                    System.out.printf("%20s", matriz[i][j]);
                } else {
                    System.out.printf("%20s", matriz[i][j]);
                }

            }
            System.out.println("");

        }
        pausa();
    }

    //CABECALHO//
    private static void cabecalho() {
        System.out.printf("%50s%n", "Participantes");
        System.out.printf("%75s%n",
                "=================================================================================");
    }

    //PAUSA//
    private static void pausa() {
        System.out.println("\n\nPara continuar digite ENTER\n");
        in.nextLine();
    }

    //pesquisar elemento//
    public static int pesquisarElemento(String valor, int nEl, String[][] mat) {
        for (int i = 0; i < nEl; i++) {
            if (mat[i][0].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    //Atualizar Participantes//
    public static boolean actualizarInfoParticipantes(String eMail, String[][] matriz, int[] s) {
        int pos;
        int nElems = s[0];
        if ((pos = pesquisarElemento(eMail, nElems, matriz)) > -1) {
            int op;
            do {
                Formatter out = new Formatter(System.out);
                mostrarParticipante(out, matriz[pos]);
                op = menuInfoParticipante();
                switch (op) {
                    case 1:
                        System.out.println("Novo Mail: ");
                        matriz[pos][0] = in.nextLine();
                        break;
                    case 2:
                        System.out.println("Novo Nome: ");
                        matriz[pos][1] = in.nextLine();
                        break;
                    case 3:
                        System.out.println("Nova data de nascimento: ");
                        matriz[pos][2] = in.nextLine();
                        break;
                    case 0:
                        System.out.println("FIM");
                        break;
                    default:
                        System.out.println("OPCAO INCORRETA");
                        break;
                }
            } while (op != 0);
            return true;
        }
        System.out.printf("O participante %s nao foi encontrado!", eMail);
        return false;
    }

    //Mostrar o participante//
    private static void mostrarParticipante(Formatter out, String[] participante) {
        for (int j = 0; j < N_CAMPOS_INFO; j++) {
            if (j == 1) {
                out.format("%30s;", participante[j]);
            } else {
                out.format("%12s;", participante[j]);
            }
        }
    }

    //Menu info do Participante//
    private static int menuInfoParticipante() {
        String texto = "ATUALIZAR INFORMACAO DE PARTICIPANTE"
                + "\n 1 -> Email"
                + "\n 2 -> Nome"
                + "\n 3 -> Data de Nascimento"
                + "\n 0 -> Terminar"
                + "\n\nQUAL A SUA OPCAO?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    //Passando o vetor com os jogos para matriz//
    public static void transformacao(String[] jogos, String[][] matriz) {
        int contador = 0;
        for (int j = 0; j < N_JOGOS; j++) {
            for (int g = 0; g < 3; g++) {
                String[] texto = jogos[j].split("-");
                matriz[j][g] = texto[g];
                contador++;
            }
        }

    }

    //Pescar a pontuacao maxima do jogo do evento escolhido //
    public static String numerodepontos(String matriz[][], String ficheiro) throws FileNotFoundException {
        String numero;
        int valor;
        String[] data = ficheiro.split("_");
        numero = data[1];
        valor = pesquisarElemento(numero, N_JOGOS, matriz);
        if (valor != -1) {
            String pontos = matriz[valor][2];
            System.out.println(pontos);
            return pontos;
        }
        return null;
    }

    //Verificar se os valores passam ou nao passam os pontos do jogo//
    public static boolean verficacaopontos(String pontos, String ficheiro) throws FileNotFoundException {
        Scanner resultados = new Scanner(new File(ficheiro + ".txt"));
        int contador = 1;
        int pontosmax = Integer.parseInt(pontos);
        while (resultados.hasNext()) {
            String rpc = resultados.nextLine();
            String rpx[] = rpc.split(";");
            int potob = Integer.parseInt(rpx[contador].trim());
            if (potob >= pontosmax) {
                return false;
            }
        }
        return true;

    }
    
    //Dar listagem a informacao da pontuacao//
    public static void listagempontos(String ficheiro,String []ficheiropnt) throws FileNotFoundException{
        Scanner leiafich=new Scanner (new File(ficheiro+".txt"));
        System.out.printf("%30s%15s%n%n","EMAIL","PONTOS");
        while(leiafich.hasNext()){
            String linha=leiafich.nextLine();
            String []linhanoeba= linha.trim().split(";");
            System.out.printf("%30s%15s%n",linhanoeba[0],linhanoeba[1] );
        }
        String a[]=ficheiro.split("_");
        ficheiropnt[0]=a[0];
        System.out.println();
    }
    
    //Backup//
    public static void backup(String ficheiropnt[]) throws FileNotFoundException{
        Scanner leiafich= new Scanner(new File(ficheiropnt[0]+".txt"));
        Formatter out=new Formatter(new File("Backup"));
        while (leiafich.hasNext()){
            String linha=leiafich.nextLine();
            String []linhanoeba= linha.trim().split(";");
            out.format("%30s%15s%n",linhanoeba[0],linhanoeba[1] );
        }
        
    }
}
