
package ficha.pkg5;

import javax.swing.JOptionPane;
public class verificacaobinaria {

    
    public static void main(String[] args) {
        int n,contador=0,contador2=0,conta;
        String texto;
        texto=JOptionPane.showInputDialog("Insira um numero");
        n= Integer.parseInt(texto);
        while (n>0){
            conta=n%10;
            if (conta==0 || conta==1){
                contador=contador+1;
            }
            n=n/10;
            contador2=contador2+1;
    }
    if (contador==contador2){
        JOptionPane.showMessageDialog(null, "Esta em binario");
    }
    else{
        JOptionPane.showMessageDialog(null, "Nao esta em binario");
    }
}
}