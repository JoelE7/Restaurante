package Restaurante;

public class Caja {

	private static Integer suma = 0;
	private Integer numeroDeCaja;
	private Boolean abiertoCerrado;
	
	public Caja() {
		this.numeroDeCaja= suma++;
		this.abiertoCerrado = false;
	}
	
	public void setEstaAbierto(Boolean abiertoCerrado) {
		this.abiertoCerrado=abiertoCerrado;
	}
	
	public Boolean getEstaAbierto(){
		return this.abiertoCerrado;
	}
	
	public Integer getNumeroDeCaja() {
		return this.numeroDeCaja;
	}
	
	
	
	
	
	
	
	
}
