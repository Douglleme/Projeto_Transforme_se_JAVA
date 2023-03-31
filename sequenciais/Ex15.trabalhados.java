package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/* Crie um programa que leia o número de dias trabalhados em um mês e
mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por
dia e ganha R$25 por hora trabalh */
public class Ex15 {
   public static void main(String[] args) {
      final float VALOR_HORA_TRABALHADA = 25.0f;

      int diasTrabalhados = Integer.parseInt (JOptionPane.showInputDialog(null, "Quantos dias você trabalhou no mês? "));

      float calcularSalario = (8 * VALOR_HORA_TRABALHADA) * diasTrabalhados;

      JOptionPane.showMessageDialog(null,"Salário calculado - R$ " + calcularSalario);
  }
}