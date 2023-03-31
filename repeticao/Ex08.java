package Exercicios.exercicios.repeticao;

import java.util.Scanner;

/* Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.  */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, idade, maioresDeIdade;
        maioresDeIdade = 0;
        
        for(i = 1; i <= 20; i++) {
            System.out.println("Digite uma idade:");
            idade = scan.nextInt();
            if(idade >= 18) {
                maioresDeIdade++;
            }
        }
        System.out.println("Temos " + maioresDeIdade + " pessoas maiores de idade");
    }
}