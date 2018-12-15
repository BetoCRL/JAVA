package ficha.pkg6;

import java.util.Scanner;

public class SolidosdeRevolucao {

  
    public static void main(String[] args) {
        String solido, fim="FIM"; 
        double volume, altura;
        int raio;
        Scanner leia= new Scanner(System.in);
        System.out.println("Insira um solido de revolucao(esfera,cone ou cilindro)");
        solido= leia.nextLine();
        while (!solido.equalsIgnoreCase("fim")){
            if ("esfera".equalsIgnoreCase(solido)){
                System.out.println("Insira o raio");
                raio= leia.nextInt();
                volume= (4/(3 * Math.pow(raio, 3)*Math.PI));
                System.out.println("Volume: " + volume);
            }
            else if ("cone".equalsIgnoreCase(solido)){
                System.out.println("Insira o raio");
                raio= leia.nextInt();
                System.out.println("Insira o altura");
                altura= leia.nextDouble();
                volume= Math.PI * Math.pow(raio,2 ) * altura;
                System.out.println("Volume: " + volume);
            }
            else if ("cilindro".equalsIgnoreCase(solido)){
                System.out.println("Insira o raio");
                raio= leia.nextInt();
                System.out.println("Insira a Altura");
                altura= leia.nextDouble();
                volume= (1/3)*Math.PI * Math.pow(raio,2 ) * altura;
                System.out.println("Volume: " + volume);
                
            }
         System.out.println("ESCOLHA : esfera,cone ou cilindro");
         solido= leia.nextLine();   
         solido= leia.nextLine();  
            
    }
    }
    
}
