package Exercicios.exercicios.sequenciais;

import java.util.Scanner;

/* Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o
serviço, sabendo que cada litro de tinta pinta uma área de 2metros
quadrados */

public class Ex10 {
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);

    System.out.println("Determine o comprimento da Parede: ");
    float length = leitor.nextFloat();
    System.out.println("Determine a altura da Parede: ");
    float height = leitor.nextFloat();

    float area = height * length ;

    System.out.println("Área: " + area + "m²");
    System.out.println("Você necessita de " + (area/2) + "ml de tinta.");
}
}
