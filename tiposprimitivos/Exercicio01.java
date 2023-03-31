package Exercicios.exercicios.tiposprimitivos;
import javax.swing.JOptionPane;

/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula:
        valor do desconto = valor do produto * percentual de desconto / 100. */
public class Exercicio01 {
    public static void main(String[] args) {
        double valorProduto = Double. parseDouble(JOptionPane. showInputDialog("Digite o valor do produto:"));
        double percentualDesconto = Double. parseDouble(JOptionPane. showInputDialog("Digite o percentual de desconto:"));
        
        double valorDesconto = valorProduto * percentualDesconto / 100;
        double valorProdutoComDesconto = valorProduto - valorDesconto;
        
        JOptionPane. showMessageDialog(null, "Valor do desconto: R$ " + valorDesconto + "\nValor do produto com desconto: R$ " +  valorProdutoComDesconto );
    }
}

