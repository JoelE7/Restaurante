package Restaurante;

public class Mesa {

	private Integer numeroMesa;
	private static Integer suma;
	
	public Mesa() {
		this.numeroMesa=suma++;
	}
	
	public Integer getNumeroMesa() {
		return numeroMesa;
	}
	
}

