package aula5;

public abstract class Moto extends Veiculo {
	protected String guidon;
	protected final Integer qtdRetrovisor = 2;
	
	public final void apoiar(){
		System.out.println("Apoiar moto");
	}
}
