package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* Crie um programa que leia o nome e o salário de um funcionário, mostrando no final
uma mensagem. */
public class Ex03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));

        JOptionPane.showMessageDialog(null,"O funcionário " + nome + " tem um sálario de R$ " + salario + " no mês atual" );
    }
}