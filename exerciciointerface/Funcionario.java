package exerciciointerface;

public abstract class Funcionario {

	private String nome;
	private String matricula;
	private double salarioBase = 1000.00;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
	this.matricula = matricula;
	}
	
}
