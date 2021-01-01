package Restaurante;

public class Restaurante {

	private Boolean mesaDisponible;
	private Mesa[][] mesas;
	private String nombreRestaurante;
	private Integer cantidadDeMozos;
	private Mozo listaDeMozos[];

	public Restaurante(String nombreRestaurante, Integer cantidadDeMozos, Integer filasXMesa, Integer columnasXMesa) {
		this.mesas = new Mesa[filasXMesa][columnasXMesa];
		this.nombreRestaurante = nombreRestaurante;
		this.cantidadDeMozos = cantidadDeMozos;
		this.listaDeMozos = new Mozo[cantidadDeMozos];

	}

	public Boolean agregarMesa(Mesa mesa) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null) {
					continue;
				} else if (mesas[i][j] == null) {
					mesas[i][j] = mesa;
					return true;
				}
			}
		}
		return false;
	}

	public String getNombreRestaurante() {
		return this.nombreRestaurante;
	}

	public Integer getCantidadDeMozos() {
		return this.cantidadDeMozos;
	}

	public Boolean agregarMozo(Mozo mozoNuevo) {
		for (int i = 0; i < listaDeMozos.length; i++) {
			if (listaDeMozos[i] != null) {
				continue;
			} else if (listaDeMozos[i] == null) {
				listaDeMozos[i] = mozoNuevo;
				return true;
			}
		}
		return false;
	}

	public Boolean consultarMesaLibre(Integer numeroDeMesa) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null) {
					if (mesas[i][j].getNumeroMesa() == numeroDeMesa) {
						Boolean ocupado = mesas[i][j].consultarSiLaMesaEstaOcupada();
						return ocupado;
					}
				}
			}
		}
		return false;
	}

	public Boolean agregarClienteAUnaMesa(Integer numeroDeMesa, Clientes cliente) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null) {
					if (mesas[i][j].getNumeroMesa() == numeroDeMesa) {
						return mesas[i][j].agregarClienteAlaMesa(cliente);
					}
				}
			}
		}
		return false;
	}

	public void getListaDeMozos() {
		for (int i = 0; i < listaDeMozos.length; i++) {
			if (listaDeMozos[i] != null) {
				System.out.println(listaDeMozos[i].toString());
			}
		}
	}

	public void consultarMesasDisponibles() {
		Integer cantidad = 0;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null) {
					if (mesas[i][j].consultarSiLaMesaEstaOcupada() == false) {
						cantidad++;
					}
				}
			}
		}
		Integer[] numeros = new Integer[cantidad];
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j] != null) {
					if (mesas[i][j].consultarSiLaMesaEstaOcupada() == false) {
						numeros[i] = mesas[i][j].getNumeroMesa();
						System.out.println("La mesa numero : " + numeros[i] + " se encuentra disponible");
					}
				}
			}
		}

	}
}
