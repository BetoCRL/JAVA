package ficha.pkg5;

import javax.swing.JOptionPane;
public class decimalparabinario {

    
    public static void main(String[] args) {
       int n, conversao;
       String texto;
       texto=JOptionPane.showInputDialog("Insira um numero");
       n=Integer.parseInt(texto);
       conversao=conversao(n);
       JOptionPane.showMessageDialog(null, "Conversao: " + conversao);
       
    }
    public static int conversao (int n){
        int conta, contador=0, numero=0;
        while (n!=0){
            conta=n%2;
            numero= (int) (numero + conta* Math.pow(10, contador));
            contador=contador+1;
            n=n/2;
        }
        return numero;
    }
    
}
