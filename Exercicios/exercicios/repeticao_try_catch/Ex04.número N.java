package Exercicios.exercicios.repeticao_try_catch;

import javax.swing.JOptionPane;

/* ) Leia o nome um número do usuário um número N e escreva o nome dele na tela N 
vezes.  */
public class Ex04 {
   public static void main(String[] args) {
      try {
         int num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes deseja repetir seu nome"));

         String nome = JOptionPane.showInputDialog("Digite seu nome ");

         for(int i = 0; i < num; i++) {
            System.out.println("Nome " + nome);
         }
      }catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Você digitou um valor inválido. Digite números por favor");
      
      }
   } 
}