package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Crie um algoritmo leia um número do usuário e exiba a sua tabuada de 
multiplicação.  */

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual tabuada deseja saber: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            int tabuada = i * numero;

            System.out.println(i + " x " + numero + " = " +  tabuada);
        }
    }
}