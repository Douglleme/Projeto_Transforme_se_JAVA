package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 
100, quantos estão entre 101 e 200 e quantos são maiores de 200.  */

public class Ex14 {
    public static void main(String[] args) {
        int numeros = 0;
        int numerosAte100 = 0;
        int numerosAte200 = 0;
        int numerosMaiorQue200 = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite um número: ");
            numeros = scan.nextInt();

            if ((numeros <= 100) && (numeros >= 0)) {
                numerosAte100 = numerosAte100 + 1;
            }
            if ((numeros <= 200) && (numeros >= 101)) {
                numerosAte200 = numerosAte200 + 1;
            }
            if (numeros >= 201) {
                numerosMaiorQue200 = numerosMaiorQue200 + 1;
            } else {

                System.out.println("");
            }
        }
        System.out.println(numerosAte100 + " números estão entre 0 e 100.");
        System.out.println(numerosAte200 + " números estão entre 101 e 200.");
        System.out.println(numerosMaiorQue200 + " números são maiores que 200.");

        scan.close();

    }

}