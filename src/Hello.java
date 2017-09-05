
public class Hello {
	
		
	public static void main(String[] args) {
		
		String [] alumnos = {"Rahul", "Justin", "Ajee", "Stev", "Anuj"};
		System.out.println("......Alumnos.....");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		

		System.out.println("......Alumno Afortunado.....");
		System.out.println(alumnos[randomNumGen(alumnos.length)]);
	}
	
	/**
	 * Genera un numero aleatorio entre el 0 y el <code>max</code>
	 * @param min es el numero minimo en este caso el <code>0</code>
	 * @param max es el numero maximo en este caso el <code>cantidad de alumnos en el array</code>
	 * @return int aleatorio
	 */
	public static int randomNumGen(int max) {
		//TODO
		int num = (int) (Math.random() * max) + 0;
		return num;
	}
}
