package Restaurante;

public class Comida {

	private TipoDeComida tipo;
	private String nombreComida;
	private Double precio;
	
	public Comida(String nombreComida,TipoDeComida tipo,Double precio) {
		this.nombreComida=nombreComida;
		this.precio=precio;
		this.tipo=tipo;
	}
	
	public TipoDeComida getTipoDeComida() {
		return this.tipo;
	}
	
	public String getNombreComida() {
		return this.nombreComida;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
}
