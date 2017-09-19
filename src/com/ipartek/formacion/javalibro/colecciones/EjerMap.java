package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjerMap {

	public static void main(String[] args) {
		int cont = 0;		
		FileReader fr = null;
		BufferedReader br = null;
		final String PATH_FICHERO = "C:\\DesarrolloEr\\workspace\\libroJava-master\\data\\caramelo\\personas.txt";
		long TInicio,TFin,tiempo;
		ArrayList<Persona> lineaarr = new ArrayList<>();
		Map<String, Persona> hasarr = new HashMap<String, Persona>();
		
		try {		
			
			fr = new FileReader(PATH_FICHERO);
			br = new BufferedReader(fr);
			
			String linea = "";
			
			while( (linea = br.readLine()) != null ) {
				
				String[] parts = linea.split(",");
				
				if(parts.length==7) {
					
					String nom = parts[0];
					String app1 = parts[1];
					String app2 = parts[2];
					String num = parts[3];
					String mail = parts[4];
					String dni = parts[5];
					String tipoper = parts[6];
					
					//Metemos en el array
					Persona pers = new Persona(nom, app1, app2, num, mail, dni,tipoper);
					lineaarr.add(pers);
					//Metenos en el Map
					hasarr.put(dni, pers);
					
				}else {
					System.out.println("Esta linea no tienene 7 churruscos");
				}
				
				cont++;
				
			}
			System.out.println("-------------------------------------------");
			System.out.println( cont + " lineas leidas");
			
		}catch ( FileNotFoundException e) {
			System.out.println("No existe el fichero indicado "  + PATH_FICHERO);
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Tiempo en recorrer el array con el for
		TInicio = System.currentTimeMillis();
		for (Persona persona : lineaarr) {
			//System.out.println(persona.getNom());
		}
		TFin = System.currentTimeMillis();
		tiempo = TFin - TInicio;
		System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		
		//Tiempo en recorrer el hass con el for
		TInicio = System.currentTimeMillis();

		cont=0;
		for (Entry<String, Persona> entry : hasarr.entrySet()) {
			if(entry.getValue().getDni().equals("26779063W")) {
				System.out.println(cont);
			}
			cont++;
		}
		
		TFin = System.currentTimeMillis();
		tiempo = TFin - TInicio;
		System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		
		
	}

}
