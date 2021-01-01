package Restaurante;

public class Clientes {

	private String nombre;
	private String codigoCliente;

	public Clientes(String nombre, String codigoCliente) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
	}

	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	public String getNombreCliente() {
		return this.nombre;
	}
}
