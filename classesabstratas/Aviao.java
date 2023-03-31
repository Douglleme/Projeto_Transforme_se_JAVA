package classesabstratas;

public class Aviao extends Veiculo{

	@Override
	public void acelerar() {
	this.setVelocidade(getVelocidade() + 100);
	}

}
