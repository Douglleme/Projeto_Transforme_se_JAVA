package Exercicios.exercicios.condicionais;

import java.util.Scanner;

/* Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em
Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até
200Km e R$0.45 para viagens mais longas.
 */
public class Ex08 {
   public static void main(String[] args) {
     
      double km, precoPassagem;
		
		Scanner scan = new Scanner(System.in);
		
      System.out.println("Qual a distância que você deseja percorrer? ");
		
      km = scan.nextDouble();
		
		if(km <= 200.0) {
			precoPassagem = km * 0.50;
			System.out.println("O preço da passagem: R$ " + precoPassagem);
		}
		else if(km > 200.0) {
			precoPassagem = km * 0.45;
			System.out.println("O preço da passagem: R$ " + precoPassagem);
		}
	}

}