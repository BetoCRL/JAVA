/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg5;

import javax.swing.JOptionPane;

public class nomeseidades {

    public static void main(String[] args) {
        int contador = 0, oqinte = 0, idade, percentagem, z, w=0;
        String nome, i = "zzz", palavra = "";
        String texto;
        String Result;
        nome = JOptionPane.showInputDialog("Insira o seu nome: ");
        texto = JOptionPane.showInputDialog("Insira a sua idade: ");
        idade = Integer.parseInt(texto);

        if (nome.equals(i)) {
            z = 0;

        } else {
            z = 1;
        }
        while (z != 0) {
            if (idade >= 18) {
                oqinte = oqinte + 1;
                palavra = palavra + "Nome: " + nome + " | Idade " + idade +  "\n";

                w++;

            }
            contador = contador + 1;
            nome = JOptionPane.showInputDialog("Insira o seu nome: ");
            texto = JOptionPane.showInputDialog("Insira a sua idade: ");
            idade = Integer.parseInt(texto);
            if (nome.equals(i)) {
                z = 0;

            } else {
                z = 1;
            }
        }
        percentagem = (int) ((contador - oqinte) * 0.100);
        JOptionPane.showMessageDialog(null, palavra);
        JOptionPane.showMessageDialog(null, "A percentagem das pessoas com menos de 18 anos é : " + percentagem);
    }

}
