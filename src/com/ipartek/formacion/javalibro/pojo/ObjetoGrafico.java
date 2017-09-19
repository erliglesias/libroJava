package com.ipartek.formacion.javalibro.pojo;

/**
 * una clase abstracta puede tenercodigo implementaod pero tiene algun
 * metado sin implementar. Y ese metodo va a ser abstracta.
 * Algo intermedio en tre class e interfaz.
 * @author Administrador
 *
 */
public abstract class ObjetoGrafico {
	int y;
	int x;
	
	void mover(int posX ,int posY) {
		this.x = posX;
		this.y = posY;
	}
	
	abstract void dibujar();
}
