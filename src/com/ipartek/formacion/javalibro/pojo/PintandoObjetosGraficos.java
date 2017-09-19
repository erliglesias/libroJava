package com.ipartek.formacion.javalibro.pojo;

public class PintandoObjetosGraficos {
	private void mai() {
		// Una clase Abstracta no se puede instanciar
		//Una interfaz tampoco se puede instanciar
		//Vendible = new Vendible
		
		Circulo c = new Circulo();
		c.dibujar();
		
		LineaColor lc = new LineaColor();
		lc.color = "rojo";
		lc.longi = 56;
		lc.dibujar();//metdo abstracto
		lc.mover(23, 12);//metodo ObjetoGrafico
	}
}
