package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
maiores do que 8. */

public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, numero, numerosMaioresQueOito;
        numerosMaioresQueOito = 0;

        for (i = 1; i <= 20; i++) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if (numero > 8) {
                numerosMaioresQueOito++;
            }
        }
        System.out.println("Temos " + numerosMaioresQueOito + " números maiores que 8");
    }
}