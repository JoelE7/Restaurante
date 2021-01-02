package Restaurante;

public class Mesa {

	private Integer numeroMesa;
	private static Integer suma = 0;
	private Integer capacidad;
	private Clientes[] mesaLugar;
	private Boolean libreOcupado;

	public Mesa(Integer capacidadDePersonas) {
		this.numeroMesa = suma++;
		this.capacidad = capacidadDePersonas;
		this.libreOcupado = false;
		this.mesaLugar = new Clientes[capacidadDePersonas];
	}

	public Integer getCapacidadDePersonas() {
		return capacidad;
	}

	public Boolean consultarSiLaMesaEstaOcupada() {
		for (int i = 0; i < mesaLugar.length; i++) {
			if (mesaLugar[i] != null) {
				this.libreOcupado = true;
				return this.libreOcupado;
			}
		}
		this.libreOcupado = false;
		return this.libreOcupado;

	}

	public Integer getNumeroMesa() {
		return this.numeroMesa;
	}

	public Boolean agregarClienteAlaMesa(Clientes clienteAagregar) {
		for (int i = 0; i < mesaLugar.length; i++) {
			if (mesaLugar[i] != null) {
				if (mesaLugar[i].getCodigoCliente().equals(clienteAagregar.getCodigoCliente())) {
					return false;
				}
			} else if (mesaLugar[i] == null) {
				mesaLugar[i] = clienteAagregar;
				return true;
			}
		}
		return false;
	}
	
	public Boolean vaciarMesa() {
		for (int i = 0; i < mesaLugar.length; i++) {
			mesaLugar[i]=null;
		}return true;
	}
	
	public Integer getCantidadDePersonasActualesEnLaMesa() {
		Integer cantidad = 0;
		for (int i = 0; i < mesaLugar.length; i++) {
			if(mesaLugar[i]!=null) {
				cantidad++;
			}
		}return cantidad;
	}

	public Clientes[] getMesaLugar() {
		return mesaLugar;
	}

	public Clientes buscarCliente(Integer numeroMesa,Clientes cliente) {
		for (int i = 0; i < mesaLugar.length; i++) {
			if(this.numeroMesa==numeroMesa&&mesaLugar[i].equals(cliente)) {
				return mesaLugar[i];
			}else {
				continue;
			}
		}return null;
	}
	
}
