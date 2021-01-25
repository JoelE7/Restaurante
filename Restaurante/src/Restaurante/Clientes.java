package Restaurante;

public class Clientes {

	private String nombre;
	private String codigoCliente;
	private Boolean hambre;


	public Clientes(String nombre, String codigoCliente) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.hambre = true;
	}

	public Boolean getHambre() {
		return this.hambre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCliente == null) ? 0 : codigoCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (codigoCliente == null) {
			if (other.codigoCliente != null)
				return false;
		} else if (!codigoCliente.equals(other.codigoCliente))
			return false;
		return true;
	}

	public void setHambre(Boolean hambre) {
		this.hambre = hambre;
	}

	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	public String getNombreCliente() {
		return this.nombre;
	}
}
