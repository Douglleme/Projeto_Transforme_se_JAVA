package heranca.funcionarios;

public class Gerente extends heranca.funcionarios.funcionarios{

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados);


}