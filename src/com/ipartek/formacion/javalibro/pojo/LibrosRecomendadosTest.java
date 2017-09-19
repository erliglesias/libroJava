package com.ipartek.formacion.javalibro.pojo;

import junit.framework.TestCase;

public class LibrosRecomendadosTest extends TestCase {
	
	public void testEquals(){
		
		LibroElec le = new LibroElec("A�os Salbajes");
		le.setAutor("william Finnegan");
		le.setTamanyo(230);
		le.setPaginas(230);
		
		LibroPap lp = new LibroPap("Papillon");
		lp.setAutor("Charriere Henri");
		lp.setPaginas(223);
		lp.setTapaBlanda(false);
		
		LibroPap lp1 = new LibroPap("Papillon");
		lp1.setAutor("Charriere Henri");
		lp1.setPaginas(223);
		lp1.setTapaBlanda(true);
		
		Libro lib = new Libro("harry Potter");
		lib.setAutor("Tururu");
		lib.setPaginas(700);
		
		assertEquals(41.0f,le.getPrecio(),0.01f);
		assertEquals(46.1f,lp.getPrecio(),0.01f);
		assertEquals(44.6f,lp1.getPrecio(),0.01f);
		assertEquals(140.0f,lib.getPrecio(),0.01f);
	}
	
	
}
