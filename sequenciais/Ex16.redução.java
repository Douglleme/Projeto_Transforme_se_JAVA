package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* [DESAFIO] Escreva um programa para calcular a redução do tempo de
vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e
quantos anos ele já fumou. Considere que um fumante perde 10 min de
vida a cada cigarro. Calcule quantos dias de vida um fumante perderá */
public class Ex16 {
   public static void main(String[] args) {
      final int DIAS_POR_ANO = 365;

      int numeroCigarros = Integer.parseInt (JOptionPane.showInputDialog(null, "Quantos cigarros você fuma por dia? "));
      int anosFumando = Integer.parseInt (JOptionPane.showInputDialog(null, "Você é fumante à quantos anos? "));

      float reducaoDosMinutos = (anosFumando * DIAS_POR_ANO) * numeroCigarros * 10;
      float reducaoDosDias = reducaoDosMinutos / (24*60);

      JOptionPane.showMessageDialog(null,"Dias perdidos: "
       + reducaoDosDias );  
  }
}