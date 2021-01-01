package Restaurante;

public class Restaurante {

	private Boolean disponible;
	private Mesa[][] mesas;
	private String nombreRestaurante;

	public Restaurante(String nombreRestaurante,Integer filasXporMesa, Integer columnasPorMesa) {
		mesas = new Mesa[filasXporMesa][columnasPorMesa];
		this.nombreRestaurante = nombreRestaurante;

	}
	
	
}
