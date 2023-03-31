package classesabstratas;

public abstract class veiculo {

	private int velocidade;
	private boolean status;
	
	public void ligar() {
		this.status = true;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public void mostrarstatus () {
		System.out.println("Status: " + isStatus());
	}
	
	public void acelerar();
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade
}

