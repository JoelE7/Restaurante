package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Restaurante.*;


public class TestRestaurante {

	@Test
	public void queSePuedaCrearUnRestauranteYAgregarUnMozo() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo mo = new Mozo("Joel","Escobar");
		Mozo ma = new Mozo("Joel","Escobar");
		Mozo ms = new Mozo("Joel","Escobar");
		Mozo mq = new Mozo("Joel","Escobar");
		Mozo mr = new Mozo("Joel","Escobar");
		Mozo mt = new Mozo("Joel","Escobar");
		assertTrue(r1.agregarMozo(mo));
		assertTrue(r1.agregarMozo(ma));
		assertTrue(r1.agregarMozo(ms));
		assertTrue(r1.agregarMozo(mq));
		assertTrue(r1.agregarMozo(mr));
		assertFalse(r1.agregarMozo(mt));
	}

	@Test 
	public void queSePuedaAgregarUnaMesa() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo mo = new Mozo("Joel","Escobar");
		r1.agregarMozo(mo);
		Mesa m1 = new Mesa(4);
		assertNotNull(m1);
		assertTrue(r1.agregarMesa(m1));
	}
	
	@Test
	public void queSePuedaConsultarUnaMesa() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo mo = new Mozo("Joel","Escobar");
		r1.agregarMozo(mo);
		Mesa m1 = new Mesa(4);
		Mesa m2 = new Mesa(4);
		Mesa m3 = new Mesa(4);
		r1.agregarMesa(m1);
		r1.agregarMesa(m2);
		r1.agregarMesa(m3);
		System.out.println(m3.getNumeroMesa());
		System.out.println(m3.getCapacidadDePersonas());
		assertFalse(r1.consultarMesaLibre(0));
	}
	
	@Test
	public void queSePuedaAgregarUnClienteAunaMesa() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo mo = new Mozo("Joel","Escobar");
		r1.agregarMozo(mo);
		Mesa m1 = new Mesa(4);
		Mesa m2 = new Mesa(4);
		Mesa m3 = new Mesa(4);
		r1.agregarMesa(m1);
		r1.agregarMesa(m2);
		r1.agregarMesa(m3);
		assertFalse(r1.consultarMesaLibre(0));
		Clientes c1 = new Clientes("s","1");
		Clientes c2 = new Clientes("s","2");
		Clientes c3 = new Clientes("s","3");
		Clientes c4 = new Clientes("s","4");
		Clientes c5 = new Clientes("s","5");
		assertTrue(r1.agregarClienteAUnaMesa(0, c1));
		assertTrue(r1.agregarClienteAUnaMesa(0, c2));
		assertTrue(r1.agregarClienteAUnaMesa(0, c3));
		assertTrue(r1.agregarClienteAUnaMesa(0, c4));
		assertFalse(r1.agregarClienteAUnaMesa(0, c5));
		assertFalse(r1.agregarClienteAUnaMesa(0, c1));
		
	}
	
	@Test
	public void consultarListaDeMozos() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo ma = new Mozo("Joel","Escobar");
		Mozo me = new Mozo("Karen","Conci");
		Mozo mi = new Mozo("Milagros","Cristaldo");
		Mozo mo = new Mozo("Agustina","Villanueva");
		Mozo mu = new Mozo("Silvana","Gomez");
		r1.agregarMozo(ma);
		r1.agregarMozo(me);
		r1.agregarMozo(mi);
		r1.agregarMozo(mo);
		r1.agregarMozo(mu);
		r1.getListaDeMozos();
	}
	
	@Test
	public void consultarMesasDisponibles() {
		Restaurante r1 = new Restaurante("la angiosplastia",5,5,5);
		Mozo mo = new Mozo("Joel","Escobar");
		r1.agregarMozo(mo);
		Mesa m1 = new Mesa(4);
		Mesa m2 = new Mesa(4);
		Mesa m3 = new Mesa(4);
		r1.agregarMesa(m1);
		r1.agregarMesa(m2);
		r1.agregarMesa(m3);
		Clientes c1 = new Clientes("s","1");
		Clientes c2 = new Clientes("s","2");
		assertTrue(r1.agregarClienteAUnaMesa(0, c1));
		assertTrue(r1.agregarClienteAUnaMesa(0, c2));
		r1.consultarMesasDisponibles();
		
	}
	
}
