package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* Crie um programa que leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto */

public class Ex12 {    
    public static void main(String[] args) {
    
    double product = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Produto: R$ "));

    double discount = product * 5/100;

    JOptionPane.showMessageDialog(null,"PREÇO PROMOCIONAL R$ " + (product - discount));   
    }
}