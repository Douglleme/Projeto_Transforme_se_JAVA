package Exercicios.exercicios.condicionais;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        
        double velocidadeDoVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Entre com a velocidade do veiculo"));

        if(velocidadeDoVeiculo > 80.0) {
            JOptionPane.showMessageDialog(null, "Você foi multado!!!!");
            double valorDaMulta = 0.0;
            double velocidadeEmExcesso = velocidadeDoVeiculo - 80.0;
            valorDaMulta = velocidadeEmExcesso * 5.0;
            JOptionPane.showMessageDialog(null, "Você ultrapassou em " + velocidadeEmExcesso + "km/h a velocidade permitida" + "\nSua multa é de: R$ " + valorDaMulta);
        }
    }
    
}