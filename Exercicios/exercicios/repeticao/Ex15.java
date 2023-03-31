package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Escreva um algoritmo que leia uma sequência de números do usuário e realize a 
soma desses números. Encerre a execução quando um número negativo for digitado */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);

        int i = 1;

        while (i > 0) {

            System.out.println("Digite um número positivo: ");
            i = scan.nextInt();
        }
        System.out.println("Valor digitado é negativo, processo encerrado!");
    }    
}