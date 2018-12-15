
package ficha.pkg5;

import javax.swing.JOptionPane;
public class Complementoex3 {

    public static void main(String[] args) {
        int n, persistencia=0, ndigitos, acumulador=1, conta, contador=0, numero;
        String texto, persis="";
        texto=JOptionPane.showInputDialog("Insira um numero: ");
        n= Integer.parseInt(texto);
        numero=n;
        ndigitos=digitos(n);
        do{
            while (n>0){
                conta=n%10;
                acumulador=acumulador * conta;
                contador=contador+1;
                n=n/10;        
            }
            persis= persis + " " + acumulador;
            n=acumulador;
            acumulador=1;
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "A persistencia é : "+ numero + persis);
    }
    public static int digitos(int n){
        int contador=0; 
        while (n>0){
            n=n/10;
            contador=contador+1;
        }
        return contador;
    }
    
}
