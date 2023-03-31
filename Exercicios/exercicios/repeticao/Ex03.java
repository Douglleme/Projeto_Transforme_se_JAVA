package Exercicios.exercicios.repeticao;

/* Leia o nome do usuário e escreva o nome dele na tela 10 vezes.  */

import javax.swing.JOptionPane;

public class Ex03 {
   public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog(null,"Nome: ");

      for (int i = 1; i <= 10; i++) {
          System.out.println(i + "-" + nome);
      }
  }    
}