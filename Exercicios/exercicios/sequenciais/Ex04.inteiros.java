package Exercicios.exercicios.sequenciais;

import java.util.Scanner;

/* Desenvolva um algoritmo que leia dois números inteiros e mostre o
somatório entre eles */
public class Ex04 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Digite o valor");
      int primeiroValor = scan.nextInt();

      System.out.println("Digite outro valor");
      int segundoValor = scan.nextInt();

      int soma = primeiroValor + segundoValor;

      System.out.println("Soma: " + soma);
      System.out.println("--------");
      System.out.println("Soma: " + (primeiroValor + segundoValor));
  }
}