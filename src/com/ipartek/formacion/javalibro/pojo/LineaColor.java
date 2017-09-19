package com.ipartek.formacion.javalibro.pojo;

public class LineaColor extends Linea {

	String color;
	
	@Override
	void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Sou una linea de color "+this.color+" y longitud "+this.longi);
	}

}
