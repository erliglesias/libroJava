package com.ipartek.formacion.javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class EjemploIterator {
	
	public static void main(String[] args) {
		HashSet<String> listanombres = new HashSet<>();
		listanombres.add("Manoloti");
		listanombres.add("Manolico");
		listanombres.add("Manoli");
		listanombres.add("Manolo");

		//Iterator es mas rapido que un for
		Iterator it = listanombres.iterator();
		String nombre;
		  long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
		  TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		while(it.hasNext()) {
			nombre = (String)it.next();
			System.out.println(nombre);
		}
		TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		  tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
		
		  
		  TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		for (String string : listanombres) {
			System.out.println(string);
		}
		TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		  tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		
	}

}
