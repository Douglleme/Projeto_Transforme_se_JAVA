package Exercicios.exercicios.repeticao;

import java.util.Scanner;

 /* Leia a idade de 20 pessoas e exiba a média das idades.  */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int somaDasIdades = 0;
        int inteiro = 1;
        do {
            
        System.out.println("Digite a Idade da " + inteiro + "ª Pessoa.");
        int idade = scan.nextInt();

        somaDasIdades += idade;
        inteiro ++;

        } while (inteiro <= 20);
        
        float mediaDasIdades = somaDasIdades / 20;

        System.out.println("Média das Idades = " + mediaDasIdades);
    }
}
