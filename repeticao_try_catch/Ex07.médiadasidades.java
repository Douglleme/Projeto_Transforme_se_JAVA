package Exercicios.exercicios.repeticao;

import java.util.Scanner;

 /* Leia a idade de 20 pessoas e exiba a média das idades.  */
public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, idade, soma;
        double media;
        soma = 0;
        for(i = 1; i <= ; i++) {
            System.out.println("Digite uma idade");
            idade = scan.nextInt();
            soma = soma + idade;
        }
        media = soma / 20;
        System.out.println("A média das idades digitadas é: " + media);
    }
}
