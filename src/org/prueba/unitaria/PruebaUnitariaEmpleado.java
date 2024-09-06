package org.prueba.unitaria;


import org.junit.jupiter.api.Test;
import org.servicios.empleado.ServicioEmpleado;

import junit.framework.TestCase;

class PruebaUnitariaEmpleado extends TestCase{

	
	ServicioEmpleado servicioEmpleado = null;
	
	@Test
	public void test() {
       servicioEmpleado = new ServicioEmpleado();
	}
	
	
	@Test
	public void salarioBonoEmpleado() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(200.0, 500.0)==700.0);
	}
	
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(200.0, 500.0), 500.0);
	}

}
