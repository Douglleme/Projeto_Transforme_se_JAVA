Package Exercicios;

import javax.swing.JOptionPane;

/* Faça um programa que leia o nome de uma pessoa e mostre uma
mensagem de boasvindas para ela: */
public class Ex02 {
    public static void main(String[] args) {
        String nome = JOptionPane.showMessageDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá " + nome + "é um prazer te conhecer!");    
}

}