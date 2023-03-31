package Exercicios.exercicios.sequenciais;

import javax.swing.JOptionPane;

/*  Faça um algoritmo que leia o salário de um funcionário, calcule e
mostre o seu novo salário, com 15% de aumento*/
public class Ex13 {
   public static void main(String[] args) {
        
      float salary = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário Atual: R$ "));

      float increase = salary * 15/100;
  
      JOptionPane.showMessageDialog(null,"Sálario com Aumento R$ " + (increase + salary));   
  }
}