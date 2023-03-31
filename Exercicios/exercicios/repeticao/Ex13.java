package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 
100.  */

public class Ex13 {
    public static void main(String[] args) {
        int numeros;
        int quantidadeDeZeroAcem = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite um número: ");

            numeros = Integer.parseInt(scan.nextLine());

            if (numeros <= 100) {
                quantidadeDeZeroAcem++;
            }
        }

        System.out.println("A quantidade de números entre Zero e Cem é de: " + quantidadeDeZeroAcem);
    }

}