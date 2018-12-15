package ficha.pkg5;

import javax.swing.JOptionPane;

public class duassequenciasdenumeros {

    public static void main(String[] args) {
        int lista1, lista2, conta, contador = 0, contador2 = 0;
        String texto;
        texto = JOptionPane.showInputDialog("Insira um numero para a 1 lista: ");
        lista1 = Integer.parseInt(texto);
        while (lista1 != 0) {
            conta = (lista1 % 2);
            if (conta == 0) {
                contador = contador + 1;
            }
            texto = JOptionPane.showInputDialog("Insira um numero para a 1 lista: ");
            lista1 = Integer.parseInt(texto);
        }
        texto = JOptionPane.showInputDialog("Insira um numero para a 2 lista: ");
        lista2 = Integer.parseInt(texto);
        while (lista2 != -1) {
            conta = (lista2 % 2);
            if (conta == 0) {
                contador2 = contador2 + 1;
            }
            texto = JOptionPane.showInputDialog("Insira um numero para a 2 lista: ");
            lista2 = Integer.parseInt(texto);
        }
        if (contador > contador2) {
            JOptionPane.showMessageDialog(null, "A lista 1 é a que contem maior numeros de pares é: " + contador);
        } else if (contador2 > contador) {
            JOptionPane.showMessageDialog(null, "A lista 2 é a  que contem maior numeros de pares é: " + contador2);
        } else {
            JOptionPane.showMessageDialog(null, "As duas listas contem o mesmo numero de pares");
        }

    }

}
