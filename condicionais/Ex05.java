package Exercicios.exercicios.condicionais;

import javax.swing.JOptionPane;

/* Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO */
public class Ex05 {
   public static void main(String[] args) {
      int anoVerificado = Integer.parseInt (JOptionPane. showInputDialog(null, "Digite o AnoVerificado: "));

      if (anoVerificado % 400 == 0) {
      }
          if ((anoVerificado % 4 == 0 ) && (anoVerificado % 100 != 0 )){
              JOptionPane. showMessageDialog(null,anoVerificado + " = Bissexto!" );
          }

      else {
          JOptionPane. showMessageDialog(null,anoVerificado + " = Não é bissexto!");
      }
  }    
}