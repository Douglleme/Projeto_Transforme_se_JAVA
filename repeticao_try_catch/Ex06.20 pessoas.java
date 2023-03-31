package Exercicios.exercicios.repeticao;
/* Leia a idade de 20 pessoas e exiba a soma das idades. */

import java.util.Scanner;

public class Ex06 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i, idade, soma;
      i = 1;
      soma = 0;
      while (i <= 20) {
          System.out.println("Digite uma idade: ");
          idade = scan.nextInt();
          soma = soma + idade;
          i++;
      }
      System.out.println("A soma das idades digitadas é: " + soma);
  }
}