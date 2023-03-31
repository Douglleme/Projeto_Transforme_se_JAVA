package Exercicios.exercicios.sequenciais;

import java.util.Scanner;

/* Crie um algoritmo que leia um número real e mostre na tela o seu dobro
e a sua terça parte. */

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        float numero = scan.nextFloat();

        float dobroDoNumero = numero + numero;
        float tercaParte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobroDoNumero);
        System.out.println("A terça parte de " + numero + " é " + tercaParte);
    }
}