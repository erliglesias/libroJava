package com.ipartek.formacion.javalibro.pojo;

public class LibroElec extends Libro{

	private int tamanyo;
	
	public LibroElec(String titulo) {
		super(titulo);
		this.tamanyo = 0;
		// TODO Auto-generated constructor stub
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	@Override
	public String toString() {
		return super.toString()+"LibroElec [tamanyo=" + tamanyo + "]";
	}
	
	@Override
	public float getPrecio() {
		float precio = super.getPrecio()-5;
		
		return precio;
	}

	
}
