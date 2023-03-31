package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
pares  */

public class Ex12 {
   public static void main(String[] args) {
      int numeros;
      int quantidadeDePares = 0;

      Scanner in = new Scanner(System.in);

      for (int i = 1; i <= 20; i++) {

         System.out.println("Digite um número: ");

         numeros = Integer.parseInt(in.nextLine());

         if (numeros % 2 == 0) {
            quantidadeDePares++;
         }
      }

      System.out.println("A quantidade de números pares é: " + quantidadeDePares);
   }

}