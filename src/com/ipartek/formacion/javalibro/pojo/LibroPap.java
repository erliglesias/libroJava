package com.ipartek.formacion.javalibro.pojo;

public class LibroPap extends Libro{
	
	private boolean tapaBlanda;
	
	public LibroPap(String titulo) {
		super(titulo);
		// TODO Auto-generated constructor stub
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return "LibroPap [tapaBlanda=" + tapaBlanda + "]";
	}

	@Override
	public float getPrecio() {
		float precio = (float) (super.getPrecio());
		if (!tapaBlanda) {
			precio = (float) (precio + 1.5);
		}
		return precio;
	}
	
	
}
