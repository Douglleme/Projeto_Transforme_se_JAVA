package Exercicios.exercicios.condicionais;
/* Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não
um bom aproveitamento (se ficou acima da média 7.0). */
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        System.out.println("------------------------------------");

        if(media > 7.0){
            System.out.println("Aluno Aprovado");
        }
        else System.out.println("Aluno Reprovado");

        scan.close();
    }
    
}