package Exercicios.exercicios.sequenciais;

import java.util.Scanner;

/* Desenvolva uma lógica que leia os valores de A, B e C de uma equação
do segundo grau e mostre o valor de Delta */


public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o coeficiente A: ");
        int coef_A = scan.nextInt();
        System.out.println("Qual o coeficiente B: ");
        int coef_B = scan.nextInt();
        System.out.println("Qual o coeficiente C: ");
        int coef_C = scan.nextInt();

        float discriminante = coef_B * coef_B -4 * coef_A * coef_C;

        System.out.println("Delta: " + discriminante);
    }
}