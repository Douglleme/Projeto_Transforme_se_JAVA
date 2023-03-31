package Exercicios.exercicios.repeticao_try_catch;

/* 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses 
números. */

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        int soma = 0;
        try {
            for(int i = 0; i < 10; i++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                soma += num;
                System.out.println("Soma agora: " + soma);
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getLocalizedMessage() + "Você digitou um valor inválido. Digite números por favor");
            e.printStackTrace();
        }

        System.out.println("Soma total: " + soma);
    }
}
