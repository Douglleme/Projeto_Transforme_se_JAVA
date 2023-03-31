package Exercicios.exercicios.condicionais;

import javax.swing.JOptionPane;

/* Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
 */
public class Ex04 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if(num%2 == 0) JOptionPane.showMessageDialog(null, "Número Par");
        else JOptionPane.showMessageDialog(null, "Número Ímpar");
    }
}