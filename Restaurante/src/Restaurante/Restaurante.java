package Restaurante;

public class Restaurante {

	private Boolean mesaDisponible;
	private Mesa[][] mesas;
	private String nombreRestaurante;
	private Integer cantidadDeMozos;
	private Mozo listaDeMozos[];
	private Caja cajas[];

	public Restaurante(String nombreRestaurante, Integer cantidadDeCajas, Integer cantidadDeMozos, Integer filasXMesa,
			Integer columnasXMesa) {
		this.mesas = new Mesa[filasXMesa][columnasXMesa];
		this.nombreRestaurante = nombreRestaurante;
		this.cantidadDeMozos = cantidadDeMozos;
		this.listaDeMozos = new Mozo[cantidadDeMozos];
		this.cajas = new Caja[cantidadDeCajas];
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

	public Boolean agregarCaja(Caja caja) {
		for (int i = 0; i < cajas.length; i++) {
			if (cajas[i] != null) {
				continue;
			} else {
				cajas[i] = caja;
				return true;
			}
		}
		return false;

	}

	public String abrirCaja(Integer numeroDeCaja) {
		for (int i = 0; i < cajas.length; i++) {
			if (cajas[i] != null) {
				if (cajas[i].getNumeroDeCaja() == numeroDeCaja) {
					cajas[i].setEstaAbierto(true);
					return "La caja numero : " + cajas[i].getNumeroDeCaja() + " se encuentra abierta";
				}
			}
		}
		return "La caja no existe";
	}

	public String cerrarCaja(Integer numeroDeCaja) {
		for (int i = 0; i < cajas.length; i++) {
			if (cajas[i] != null) {
				if (cajas[i].getNumeroDeCaja() == numeroDeCaja) {
					cajas[i].setEstaAbierto(false);
					return "La caja numero : " + cajas[i].getNumeroDeCaja() + " se ha cerrado";
				}
			}
		}
		return "La caja no existe";
	}

	public Boolean vaciarMesa(Integer numeroDeMesa) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].getNumeroMesa() == numeroDeMesa) {
					return mesas[i][j].vaciarMesa();
				}
			}
		}
		return false;

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
		if (cantidad == 0) {
			System.out.println("En este momento, no se encuentra ninguna mesa disponible");
		}

	}
	
//	public Boolean agregarPedidoAUnaMesa(Comida comida,Integer numeroDeMesa) {
//			for (int i = 0; i < mesas.length; i++) {
//				for (int j = 0; j < cajas.length; j++) {
//					if(mesas[i][j].getNumeroMesa()==numeroDeMesa) {
//						
//					}
//				}
//			}
//	}
		
		
		
	
	
}
