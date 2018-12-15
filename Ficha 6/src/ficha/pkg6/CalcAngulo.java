
package ficha.pkg6;

import java.util.Scanner;

public class CalcAngulo {

        
    public static void main(String[] args) {
        int verificao, lado1, lado2, lado3; 
        Double conta;
        Double ab,ac,bc;
        String angulos="";
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o primeiro lado: ");
        lado1= leia.nextInt();
        System.out.println("Insira o segundo lado: ");
        lado2= leia.nextInt();
        System.out.println("Insira o terceiro lado: ");
        lado3= leia.nextInt();
        verificao=verificao(lado1,lado2,lado3);
        if (verificao==1){
            ab=calcAngAB(lado1,lado2,lado3);
            ac=calcAngAC(lado1,lado2,lado3);
            bc=calcAngBC(lado1,lado2,lado3);
            conta=ab+ac+bc;
            System.out.println("Soma dos angulos internos: " + conta);
            System.out.println("Angulo AB do triangulo:" + ab+"\nAngulo AC do triangulo:" + ac+ "\nAngulo CB do triangulo:" + bc);
                    }
        else{
            System.out.println("Impossivel");
        }
    }
    public static int verificao(int lado1, int lado2 ,int  lado3){
        int resultado = 0;
        if (lado1 + lado2 > lado3 ){
            if (lado2 + lado3 > lado1){
                if (lado1+ lado3> lado2){
                    resultado=1;
                }
            }
        }
        else{
            resultado=0;
        }
        return resultado;
    }
    public static double calcAngAB(int a, int b, int c){
      double m;
      double angulo= Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b));
      m=Math.toDegrees(angulo);
      return m;
    }
    public static double calcAngAC(int a, int b, int c){
      double m;
      double angulo= Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2*a*c));
      m=Math.toDegrees(angulo);
      return m;
    }
    public static double calcAngBC(int a, int b, int c){
       double m;
      double angulo= Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2*b*c));
      m=Math.toDegrees(angulo);
      return m;
    }
}
