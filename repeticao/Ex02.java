package Exercicios.exercicios.repeticao;

/* Escreva um algoritmo que calcule a soma dos números de 1 a 15 */

public class Ex02 {
   public static void main(String[] args) {
       
    int soma=0;
    int i = 1;
    while(i<= 15){
        soma =soma +i;
        i+=1;
    }
    System.out.println(soma);
}
}