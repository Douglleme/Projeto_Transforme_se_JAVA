package Exercicios.exercicios.tiposprimitivos;

import javax.swing.JOptionPane;

public class LeituraComGUI {
 public static void main(String[] args) {
    int idade = 0;
    String aux = JOptionPane.showInputDialog("Insira uma idade");

    idade = Integer.parseInt(aux);

    JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);

    /* JOptionPane.showConfirmDialog(null, "Inteiro: " + JOptionPane.showConfirmDialog(null, "Você confirma a veracidade dos dados preenchidos"));
     */
 }   
}