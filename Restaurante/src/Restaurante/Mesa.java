package Restaurante;

public class Mesa {

	private Integer numeroMesa;
	private static Integer suma;
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
			if (mesaLugar != null) {
				return this.libreOcupado = true;
			}
		}
		return this.libreOcupado = false;

	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public Boolean agregarClienteAlaMesa(Clientes clienteAagregar) {
		for (int i = 0; i < mesaLugar.length; i++) {
			if (mesaLugar[i].getCodigoCliente().equals(clienteAagregar.getCodigoCliente())) {
				return false;
			} else if (mesaLugar[i] != null) {
				continue;
			} else if (mesaLugar[i] == null) {
				mesaLugar[i] = clienteAagregar;
				return true;
			}
		}
		return false;
	}

}
