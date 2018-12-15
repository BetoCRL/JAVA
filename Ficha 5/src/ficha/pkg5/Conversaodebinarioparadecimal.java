/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg5;

import javax.swing.JOptionPane;

public class Conversaodebinarioparadecimal {

    public static void main(String[] args) {
        int n, verificacao, conversao = 0;
        String texto;
        texto = JOptionPane.showInputDialog("Insira um numero: ");
        n = Integer.parseInt(texto);
        verificacao = verificacao(n);
        if (verificacao == 0) {
            JOptionPane.showMessageDialog(null, "Nao é um numero binario");
        } else {
            conversao = conversao(n);
            JOptionPane.showMessageDialog(null, "Conversão para numero decimal: " + conversao);
        }

    }

    public static int verificacao(int n) {
        int conta, contador = 0, contador2 = 0, numero;
        numero = n;
        while (n > 0) {
            conta = n % 10;
            if (conta >= 0 && conta <= 1) {
                contador = contador + 1;
            }
            contador2 = contador2 + 1;
            n = n / 10;

        }

        if (contador == contador2) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int conversao(int n) {
        int contador = 0, numero = 0, conta;
        while (n > 0) {
            conta = n % 10;
            numero = (int) (numero + conta * Math.pow(2, contador));
            contador = contador + 1;
            n = n / 10;
        }

        return numero;
    }

}
