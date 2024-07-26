package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento comportamente;
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamente = comportamento;
	}

	public void mover() {
		comportamente.mover();
		
	}
}
