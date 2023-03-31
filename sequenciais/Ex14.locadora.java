package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* A locadora de carros precisa da sua ajuda para cobrar seus serviços.
Escreva um programa que pergunte a quantidade de Km percorridos por
um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado */
public class Ex14 {
   public static void main(String[] args) {
      final float PRECO_DIA = 90f;
      final float PRECO_QUILOMETRO = 0.20f;

      float QuilometrosRodados = Float.parseFloat(JOptionPane.showInputDialog(null, "Quilometros percorridos: "));
      float dias = Float.parseFloat(JOptionPane.showInputDialog(null, "Dias Utilizados: "));

      float calculoPorDia = PRECO_DIA * dias;
      float calculoPorQuilometros = PRECO_QUILOMETRO * QuilometrosRodados;

      JOptionPane.showMessageDialog(null,"Total á Pagar R$ " + (calculoPorDia + calculoPorQuilometros));
  }
}