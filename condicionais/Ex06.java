package Exercicios.exercicios.condicionais;

import javax.swing.JOptionPane;

/* Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre
em quantos anos faltam para o alistamento. - Se já tiver depois dos 18 anos, mostre
quantos anos já se passaram do alistamento. */
public class Ex06 {
   public static void main(String[] args) {
      int ano = Integer. parseInt (JOptionPane. showInputDialog(null, "Digite o Ano de Nascimento: "));

      int idade = 2023 - ano;

      if (idade == 18) {
          JOptionPane. showMessageDialog(null,"Você tem " + idade + " anos.\nHora do seu Alistamento!");
      }
      if (idade > 18) {
          int idadeMaior = idade - 18;
          JOptionPane. showMessageDialog(null,"Você tem " + idade + " anos.\nPassou " + idadeMaior +  " anos do seu Alistamento!");
      }
      if (idade < 18) {
          int idadeMenor = 18 - idade;
          JOptionPane. showMessageDialog(null,"Você tem " + idade + " anos.\nNão pode se Alistar!\nSomente daqui " + idadeMenor + " ano(s) " );
      }
  }    
}