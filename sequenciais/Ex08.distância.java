package Exercicios.exercicios.sequenciais;

import java.util.Scanner;

/* Desenvolva um programa que leia uma distância em metros e mostre os
valores relativos em outras medida
Ex: Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma distância em metros: ");
        float distancia = scanner.nextFloat();

        System.out.println("Km: " + (distancia / 1000));
        System.out.println("Hm: " + (distancia / 100));
        System.out.println("Dam: " + (distancia / 10));
        System.out.println("dm: " + (distancia * 10));
        System.out.println("cm: " + distancia * 100);
        System.out.println("mm: " + distancia * 1000);

    }
}