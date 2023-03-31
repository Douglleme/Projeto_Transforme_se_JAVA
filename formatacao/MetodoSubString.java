package Exercicios.exercicios.formatacao;

import java.util.Scanner;

public class MetodoSubString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma msg:");
        String msg = scan.next();

        System.out.println("Player: " + msg.replace("sexo", "*********"));
    }
}