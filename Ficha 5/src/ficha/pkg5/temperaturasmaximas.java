
package ficha.pkg5;

import javax.swing.JOptionPane;

public class temperaturasmaximas {

    public static void main(String[] args) {
        int n, dias, contador = 1, maiortemp;
        String texto = new String();
        texto = JOptionPane.showInputDialog("Insira o numero de dias: ");
        dias = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("Insira uma temperatura: ");
        n = Integer.parseInt(texto);
        maiortemp = n;
        while (contador < dias) {
            texto = JOptionPane.showInputDialog("Insira uma temperatura: ");
            n = Integer.parseInt(texto);
            if (maiortemp < n) {
                maiortemp = n;
            }
            contador = contador + 1;
           
        }
        System.out.println(maiortemp);
        if ((maiortemp>=-30) && (maiortemp<9)){
            JOptionPane.showMessageDialog(null, "Muito Frio");
        }
        else if ((maiortemp>= 9) && (maiortemp<15)){
            JOptionPane.showMessageDialog(null, "Frio");
        }
        else if ((maiortemp>=15) && (maiortemp<20)){
            JOptionPane.showMessageDialog(null, "Ameno" );
        }
        else if ((maiortemp>=20) && (maiortemp<30)){
            JOptionPane.showMessageDialog(null, "Quente");
        }
        else if ((maiortemp>=30) && (maiortemp<50)){
            JOptionPane.showMessageDialog(null, "Muito Quente");  
        }
        else{
            JOptionPane.showMessageDialog(null, "Temperatura Extrema");
        }
    }

}
