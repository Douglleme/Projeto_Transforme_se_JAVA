package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.  */

public class Ex09 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i, idade, pessoaMaisNova;
      String nome, nomeDaPessoaMaisNova;
      System.out.println("Digite o nome:");
      nome = scan.next() + scan.nextLine();
      System.out.println("Digite a idade: ");
      idade = scan.nextInt();
      pessoaMaisNova = idade;
      nomeDaPessoaMaisNova = nome;
      for (i = 1; i <= 9; i++) {
         System.out.println("Digite o nome:");
         nome = scan.next() + scan.nextLine();
         System.out.println("Digite a idade: ");
         idade = scan.nextInt();
         if (idade < pessoaMaisNova) {
            nomeDaPessoaMaisNova = nome;
            pessoaMaisNova = idade;
         }
      }
      System.out.println(
            "A pessoa mais nova da turma é " + nomeDaPessoaMaisNova + " com apenas " + pessoaMaisNova
                  + " anos de vida");
   }
}