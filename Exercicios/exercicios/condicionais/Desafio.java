package Exercicios.exercicios.condicionais;

import javax.swing.JOptionPane;

/* [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. Analise seus
comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente,
para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor
que a soma dos outros dois */
public class Desafio {
   public static void main(String[] args) {
      float reta01 = Float. parseFloat (JOptionPane. showInputDialog(null,"Comprimento da 1ª Reta: "));
      float reta02 = Float. parseFloat (JOptionPane. showInputDialog(null,"Comprimento da 2ª Reta: "));
      float reta03 = Float. parseFloat (JOptionPane. showInputDialog(null,"Comprimento da 3ª Reta: "));


      if ((reta01 + reta02 > reta03) && (reta01 + reta03 > reta02) && (reta02 + reta03 >   reta01  )) {
          JOptionPane. showMessageDialog(null,"SIM! \n É possível formar um Triângulo");
      } 
      else {
          JOptionPane. showMessageDialog(null,"NÃO! \n Impossível formar um Triângulo");
      }
  }
}