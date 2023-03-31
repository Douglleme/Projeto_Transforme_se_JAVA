package Exercicios.exercicios.repeticao_try_catch;

/* Escreva um algoritmo que leia uma sequência de números do usuário e realize a 
soma desses números. Encerre a execução quando um número negativo for digitado */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0, soma = 0;
  
        while(n >= 0){
  
            if (n >= 0){
  
                System.out.println("Digite um número inteiro: ");
  
                n = scan.nextInt();
  
                soma = n + soma;
  
                System.out.println("Resultado:" +soma);
  
            }
  
        }
  
     }
    
  }