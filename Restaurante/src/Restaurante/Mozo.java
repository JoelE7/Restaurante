package Restaurante;

public class Mozo {

	private String nombre;
	private String apellido;
	private static Integer numeroMozo = 0;
	private Integer numeroDelMozo;
	
	public Mozo(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDelMozo= numeroMozo++;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "[Numero del mozo : " + numeroDelMozo + "/" + " Nombre del mozo : " + nombre + "/"  + " Apellido del mozo : " + apellido + "]";
	}

	
	
}
