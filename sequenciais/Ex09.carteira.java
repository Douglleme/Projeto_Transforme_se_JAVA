package Exercicios.exercicios.sequenciais;

import java.util.Scanner;
/* Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
(em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45 */
public class Ex09 {
    public static void main(String[] args) {
		double valorEmDolar = 3.45, valorEmReal, valorDeTroca ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor que você tem na carteira: ");
		valorEmReal = scan.nextDouble();
		
		valorDeTroca = valorEmReal / valorEmDolar;
		
		System.out.println("Você pode comprar US$" + valorDeTroca + " dolares com o valor que tem em sua carteira.");

	}

}